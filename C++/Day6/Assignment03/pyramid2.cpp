/*1. Program to Print a Pyramid Using Numbers

        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
  */
    

#include <iostream>
using namespace std;

int main() {
    int rows = 5;

    for (int i = 1; i <= rows; i++) {
       
        for (int space = 1; space <= rows - i; space++) {
            cout << "  ";
        }

       
        int n = i;
        for (int j = 1; j <= i; j++) {
            cout << n++ << " ";
        }

        n =n- 2;
        for (int j = 1; j < i; j++) {
            cout << n-- << " ";
        }

        cout << endl;
    }

    return 0;
}
