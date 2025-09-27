#include<iostream>
using namespace std;
int main(){
 
    int n[5];
    int max=0;
    cout<<"enter the elements in the array"<<endl;
    
    for(int i=0;i<=5;i++){

        cin>>n[i];



    }

 for(int i=0;i<=5;i++){

        cout<<n[i]<<endl;



    }

     for(int i=0;i<=5;i++){
 
   if (max<n[i])
   {
    max=n[i];
   }
   



    }

    cout<<"the largest no is \n"<< max<<endl;
}