#include<iostream>
using namespace std;

class A
{
    public:
    A()
    {
        cout<<" default constructor of A"<<endl;
    }
    A(int a)
    {
        cout<<" A's paramaterized constructor"<<endl;
        cout<<"Value of a "<<a;

    }
};

class B
{

    public:
    B()
    {
        cout<<" default constructor of B"<<endl;
    }
    B(int m,int n)
    {
        cout<<" B's paramaterized constructor"<<endl;
        cout<<"Value of m"<<m<<endl;
          cout<<"Value of n"<<n<<endl;


    }
};

class C:public B,public A{
    public:

    C(int p,int q):A(p),B(p,q)
    {
        cout<<" C's constructor"<<endl;
    }
};

int main()
{
    C obj(20,10);
}