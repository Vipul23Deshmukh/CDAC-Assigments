#include <iostream>
#include <vector>
#include <fstream>
#include <stdexcept>
#include <string>
using namespace std;

class Student {
    int rollNo;
    string name;
    int marks[3];

public:
    Student() {}

    Student(int r, string n, int m1, int m2, int m3) {
        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100)
            throw invalid_argument("Invalid marks!");

        rollNo = r;
        name = n;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    int getRollNo() const { return rollNo; }

    float getAverage() const {
        return (marks[0] + marks[1] + marks[2]) / 3.0f;
    }

    void display() const {
        cout << "Roll No: " << rollNo << ", Name: " << name;
        cout << ", Marks: [" << marks[0] << ", " << marks[1] << ", " << marks[2] << "]";
        cout << ", Average: " << getAverage() << endl;
    }

    void updateMarks(int m1, int m2, int m3) {
        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100)
            throw invalid_argument("Invalid marks!");
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    // Operator overloading for bonus marks (++Student)
    Student& operator++() {
        for (int i = 0; i < 3; ++i)
            if (marks[i] < 100)
                marks[i]++;
        return *this;
    }

    // Compare two students by average marks
    bool operator>(const Student& other) const {
        return this->getAverage() > other.getAverage();
    }

    // Save student to file
    void saveToFile(ofstream& out) const {
        out << rollNo << " " << name << " " << marks[0] << " " << marks[1] << " " << marks[2] << "\n";
    }

    // Load student from file
    void loadFromFile(ifstream& in) {
        in >> rollNo >> name >> marks[0] >> marks[1] >> marks[2];
    }
};

class Gradebook {
    vector<Student> students;

public:
    void addStudent(const Student& s) {
        for (const auto& student : students)
            if (student.getRollNo() == s.getRollNo())
                throw runtime_error("Duplicate roll number!");

        students.push_back(s);
    }

    void displayAll() const {
        if (students.empty())
            throw runtime_error("Gradebook is empty!");

        for (const auto& s : students)
            s.display();
    }

    void searchAndUpdate(int rollNo, int m1, int m2, int m3) {
        for (auto& s : students) {
            if (s.getRollNo() == rollNo) {
                s.updateMarks(m1, m2, m3);
                return;
            }
        }
        throw runtime_error("Student not found!");
    }

    void saveToFile(const string& filename) const {
        ofstream out(filename);
        for (const auto& s : students)
            s.saveToFile(out);
        out.close();
    }

    void loadFromFile(const string& filename) {
        ifstream in(filename);
        if (!in) return;

        while (!in.eof()) {
            Student s;
            s.loadFromFile(in);
            if (in) students.push_back(s);
        }
        in.close();
    }
};

// ---------------- MAIN ----------------

int main() {
    Gradebook gb;
    gb.loadFromFile("gradebook.txt");

    try {
        Student s1(1, "Alice", 85, 90, 92);
        Student s2(2, "Bob", 78, 81, 75);
        ++s1;  // bonus marks
        gb.addStudent(s1);
        gb.addStudent(s2);
    }
    catch (exception& e) {
        cout << "Error: " << e.what() << endl;
    }

    try {
        gb.displayAll();
    }
    catch (exception& e) {
        cout << "Error: " << e.what() << endl;
    }
    
    try {
        gb.searchAndUpdate(2, 88, 85, 80);  // update Bob's marks
    }
    catch (exception& e) {
        cout << "Error: " << e.what() << endl;
    }

    gb.saveToFile("gradebook.txt");

    return 0;
}
