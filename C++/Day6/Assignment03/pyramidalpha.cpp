/*5. Program to Print Pyramid Using Alphabets
        A
      A B C
    A B C D E
 A B C D E F G H 
A B C D E F G H I    */

#include <iostream>
using namespace std;

int main() {

    int space, rows;
    //char c='A';

    cout <<"Enter number of rows: ";
    cin >> rows;

    for(int i = 1, k = 0; i <= rows; ++i, k = 0) {
      char c='A';
        for(space = 1; space <= rows-i; ++space) {
            cout <<"  ";
        }

        while(k != 2*i-1) {
            cout <<c++<<" ";
            
            ++k;
            
        }
        
        cout << endl;
       
    }    
    return 0;
}