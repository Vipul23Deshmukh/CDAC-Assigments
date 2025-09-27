/*4. Program to Print Half-Pyramid Using Alphabets
A
B B
C C C
D D D D
E E E E E
*/
#include<iostream>
using namespace std;
int main(){

 char a='A';
 for(int i=0;i<5;i++)
 {

    for(int j =0;j<=i;j++)
    {

        cout<<a<<"\t";
       
    }
     a++;
    cout<<endl;

 }
 
}