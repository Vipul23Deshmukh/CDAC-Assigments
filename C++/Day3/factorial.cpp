#include <iostream>
using namespace std;

int main()
{
    int i,num ,fact=1;
    cout<<"Enter a number";
    cin>>num;
    for(i=2;i<=num;i++)
    {
    fact=fact*i;
    

    }
    cout<<"the factorial is "<<fact<<endl;
}