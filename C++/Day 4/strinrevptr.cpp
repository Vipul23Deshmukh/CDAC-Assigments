#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    cin >> str;  

    char* start = &str[0];               
    char* end = &str[0] + str.length() - 1;  

    while (start < end) {
       
        char temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }

    cout << "Reversed string: " << str << endl;
    return 0;
}



