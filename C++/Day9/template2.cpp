#include<iostream>
using namespace std;
template <class T>
void swap1(T &x, T &y)
{
    T temp;
    temp=x;
    x=y;
    y=temp;
}
int main()
{
    int a=50,b=10;
    char x='A',y='M';

    cout<<" before swapping ....."<<endl;
    cout<<"a= "<<a<<"\t"<<"b= "<<b<<endl;
     cout<<"x= "<<x<<"\t"<<"y= "<<y<<endl;

     cout<<" After swapping......"<<endl;

    swap1(a,b);
    cout<<"a= "<<a<<"\t"<<"b= "<<b<<endl;

    swap1(x,y);
    cout<<"x= "<<x<<"\t"<<"y= "<<y<<endl;
    

}