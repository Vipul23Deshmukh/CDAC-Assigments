#include<iostream>
using namespace std;
int main(){

     int a[5];
     cout<<"    Enter the the array ";
     
     for (int i=0;i<=4;i++)
     {
      cin>>a[i];

     }

      cout<<"Array elemenys are"<<endl;
     for (int i=0;i<=4;i++)
     {
      cout<<a[i]<<"\t";

     }
     cout<<endl;
     cout<<" Array elemens using pointer"<<endl;
     cout<<*(a+0)<<"\t";
     cout<<*(a+2)<<"\t";
     cout<<a[1]<<"\t";
     cout<<a[2]<<"\t";

     
}