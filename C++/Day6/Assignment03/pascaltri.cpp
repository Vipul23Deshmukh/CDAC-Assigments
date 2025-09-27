/*
3. Print Pascal's Triangle

           1
         1   1
       1   2   1
     1   3   3    1
   1  4    6   4   1
 1  5   10   10  5   1

*/
#include <iostream>
using namespace std;

int main() {
    int rows = 6;

    for (int i = 0; i < rows; i++) {
     
        for (int space = 0; space < rows - i - 1; space++) {
            cout << "  ";
        }

        int val = 1;
        for (int j = 0; j <= i; j++) {
            cout << val << "   ";
            val = val * (i - j) / (j + 1); 
        }

        cout << endl;
    }

    return 0;
}
