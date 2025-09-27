/*
2.Inverted Full Pyramid Using *


* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
  */      

  #include<iostream>
using namespace std;
int main(){


    int n=5;
for (int i = 0; i < n; i++) {

        
        int space = i;

        
        for (int j = 0; j < 2 * n - i - 1; j++) {

          
            if (space) {
                cout << "  ";
                space--;
            }
            else {
                cout << "* ";
            }
        }
        cout << endl;
    }
}




