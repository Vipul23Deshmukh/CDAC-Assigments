#include<iostream>
using namespace std;
int swap(int& ,int&);
int main()
{
    int a=10,b=20;
    cout<<" Swapping values using reference"<<endl;
    cout<<" Values before swapping : "<<endl;
    cout<<" a ="<<a<<" \t "<<" b = "<<b<<endl;
    swap(a,b);
    cout<<" Values After swapping : "<<endl;
    cout<<" a ="<<a<<" \t "<<" b = "<<b<<endl;

    
}

int swap(int& p, int& q)
{
    int temp;
    temp=p;
    p=q;
    q=temp;
    cout<<" Values After swapping : "<<endl;
    cout<<" p ="<<p<<" \t "<<" q = "<<q<<endl;
    


}