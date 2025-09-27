#include<iostream>
using namespace std;
int main()
{
    int ptr[5];
    int* ptr1[5];


    cout<<" enter array elements :"<<endl;
    for(int i=0;i<=4;i++)
    {
        cin>>ptr[i];
    }

      cout<<" Array elements are : "<<endl;

     for(int i=0;i<=4;i++)
    {
        cout<<ptr[i]<<endl;
    }

    
      

    cout<<" elements stored in array pointer: "<<endl;

    for(int i=0;i<=4;i++)
    {
        ptr1[i]=&ptr[i];
        cout<<*ptr1[i]<<endl;
    }
}