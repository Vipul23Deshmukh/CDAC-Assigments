#include<iostream>
#include<math.h>
using namespace std;
int main(){

double Amount,Time,CI,Principal,rate;

    cout<<"Enter Principal: " ;
     cin>>Principal;
     cout<<"Enter Rate :"  ;
     cin>>rate;


     cout<<"Enter Time: " ;
     cin>>Time;


      Amount=Principal*pow(1+(rate/100),Time);        
      CI=Amount-Principal;

        cout<<"CI= "<<CI ;



}