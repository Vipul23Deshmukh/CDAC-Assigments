#include<iostream>
using namespace std;
int main()
{
    int n;
    int m;
    cout<<" enter n :"<<endl;
    cin>>n;
    cout<<" enter m :"<<endl;
    cin>>m;

    try{
        if(m=0)
        {
            throw 0;
        }
        else{
            int r=n/m;
            cout<<" result=r";
        }
    }
    catch(int a)
    {
        cout<<" denominator can not be zero.."<<endl;
    }
    cout<<" end of program.."<<endl;
    
}