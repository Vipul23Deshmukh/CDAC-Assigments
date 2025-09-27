#include <iostream>
using namespace std;

class Student {
    public:
    int rollno;
    char dob[11]; 
    int marks;


    void accept() {
        cout << "Enter roll number: ";
        cin >> rollno;
        cout << "Enter date of birth  ";
        cin >> dob;
        cout << "Enter total marks: ";
        cin >> marks;
    }

    void display() {
        cout << "Roll No: " << rollno
             << "    Date Of Birth: " << dob
             << "    Total Marks: " << marks << endl;
    }

    int getRollNo() {
        return rollno;
    }
};

int main() {
    int n;
    cout << "Enter number of students: ";
    cin >> n;

    Student* p = new Student[n];

    for (int i = 0; i < n; i++) {
        cout << "\nStudent " << i + 1 << ":\n";
        p[i].accept();
    }

    
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (p[j].getRollNo() > p[j + 1].getRollNo()) {
                Student temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }

    cout << "\nSorted list of students by Roll Number:\n";
    for (int i = 0; i < n; i++) {
        p[i].display();
    }

    delete[] p; 
    return 0;
}
