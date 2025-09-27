#include <iostream>
#include <vector>
#include <fstream>
#include <stdexcept>

using namespace std;

// ============================
// Item Class
// ============================
class Item {
public:
    int itemID;
    string itemName;
    double price;
    int stockQuantity;

    Item(int id = 0, string name = "", double p = 0.0, int qty = 0) {
        if (p < 0 || qty < 0)
            throw invalid_argument("Price or quantity cannot be negative.");
        itemID = id;
        itemName = name;
        price = p;
        stockQuantity = qty;
    }

    void display() const {
        cout << "ID: " << itemID << ", Name: " << itemName
             << ", Price: $" << price << ", Stock: " << stockQuantity << endl;
    }
};

// ============================
// PurchasedItem (for bill)
// ============================
struct PurchasedItem {
    Item item;
    int quantity;

    double getTotalPrice() const {
        return item.price * quantity;
    }
};

// ============================
// Bill Class
// ============================
class Bill {
    int billID;
    string customerName;
    vector<PurchasedItem> purchasedItems;

public:
    Bill(int id, string name) : billID(id), customerName(name) {}

    // Operator + to add item to bill
    Bill& operator+(const PurchasedItem& pItem) {
        if (pItem.quantity > pItem.item.stockQuantity)
            throw runtime_error("Not enough stock available.");
        purchasedItems.push_back(pItem);
        return *this;
    }

    // Operator << to display bill
    friend ostream& operator<<(ostream& out, const Bill& bill) {
        if (bill.purchasedItems.empty())
            throw runtime_error("Cannot generate an empty bill.");

        out << "Bill ID: " << bill.billID << ", Customer: " << bill.customerName << endl;
        out << "--------------------------------------------------\n";
        double total = 0.0;
        for (const auto& p : bill.purchasedItems) {
            out << "Item: " << p.item.itemName
                << ", Quantity: " << p.quantity
                << ", Unit Price: $" << p.item.price
                << ", Subtotal: $" << p.getTotalPrice() << endl;
            total += p.getTotalPrice();
        }
        out << "--------------------------------------------------\n";
        out << "Total Amount: $" << total << endl;
        return out;
    }

    // Save bill to file
    void saveToFile(const string& filename) const {
        ofstream outFile(filename, ios::app); // append mode
        if (!outFile) {
            throw runtime_error("Cannot open file to save bill.");
        }

        outFile << "Bill ID: " << billID << ", Customer: " << customerName << endl;
        outFile << "--------------------------------------------------\n";
        double total = 0.0;
        for (const auto& p : purchasedItems) {
            outFile << "Item: " << p.item.itemName
                    << ", Quantity: " << p.quantity
                    << ", Unit Price: $" << p.item.price
                    << ", Subtotal: $" << p.getTotalPrice() << endl;
            total += p.getTotalPrice();
        }
        outFile << "--------------------------------------------------\n";
        outFile << "Total Amount: $" << total << endl << endl;

        outFile.close();
    }
};

// ============================
// Main Function
// ============================
int main() {
    try {
        // Sample items in store
        vector<Item> inventory = {
            Item(1, "Laptop", 800.00, 10),
            Item(2, "Keyboard", 25.00, 50),
            Item(3, "Mouse", 15.00, 60),
            Item(4, "Monitor", 150.00, 20)
        };

        cout << "Welcome to Tech Store Billing System!\n";
        cout << "Available Items:\n";
        for (const auto& item : inventory) {
            item.display();
        }

        int billID = 1;
        string customerName;
        cout << "\nEnter Customer Name: ";
        getline(cin, customerName);

        Bill bill(billID, customerName);
        char choice;

        do {
            int id, qty;
            cout << "\nEnter Item ID to purchase: ";
            cin >> id;
            cout << "Enter quantity: ";
            cin >> qty;

            // Find item
            bool found = false;
            for (auto& item : inventory) {
                if (item.itemID == id) {
                    if (qty < 0)
                        throw invalid_argument("Quantity cannot be negative.");
                    PurchasedItem pItem{item, qty};
                    bill = bill + pItem;
                    item.stockQuantity -= qty; // Update stock
                    found = true;
                    break;
                }
            }
            if (!found)
                cout << "Item not found!\n";

            cout << "Add another item? (y/n): ";
            cin >> choice;
        } while (choice == 'y' || choice == 'Y');

        cout << "\n-------- BILL --------\n";
        cout << bill;

        // Save to file
        bill.saveToFile("bills.txt");
        cout << "\nBill saved to bills.txt\n";

    } catch (const exception& e) {
        cerr << "\nError: " << e.what() << endl;
    }

    return 0;
}
