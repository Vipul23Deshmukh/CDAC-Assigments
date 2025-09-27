#include <iostream>
using namespace std;

int main() {
    int onum, rem,num, result = 0;
    cout << "Enter a number ";
    cin >> num;
    onum = num;

    while (onum != 0) {
        rem = onum % 10;
        
        result= result+ rem * rem * rem;
        
        onum /= 10;
    }

    if (result == num)
        cout << num << " is armstrong number.";
    else
        cout << num << " is not a armstrong number.";

    
}