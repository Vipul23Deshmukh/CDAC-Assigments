#include<iostream>
using namespace std;
int main(){
 
    int n[5];
    int min;
    cout<<"enter the elements in the array"<<endl;
    
    for(int i=0;i<=5;i++){

        cin>>n[i];



    }

 for(int i=0;i<=5;i++){

        cout<<n[i]<<endl;



    }

     for(int i=1;i<=5;i++){
 \
     min=n[0];
      if(n[i]<min)
    {
        min=n[i];

    }
   



    }

    cout<<"the smallest no is \n"<< min<<endl;
}