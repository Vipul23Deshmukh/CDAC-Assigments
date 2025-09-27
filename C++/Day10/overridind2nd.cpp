#include <iostream>
using namespace std;

class Base {
public:
    void display() {
        cout << "Display from Base class" << endl;
    }
};

class Derived : public Base {
public:
    void display() {
        cout << "Display from Derived class" << endl;
    }
};

int main() {
    Base* basePtr;
    Derived derivedObj;

    basePtr = &derivedObj;

    basePtr->display();  // Calls Base::display(), not Derived::display()

    return 0;
}
