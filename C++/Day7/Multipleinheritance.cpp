#include<iostream>
//#include<conio.h>
using namespace std;
class A
{
    public:
    A()
    {
        cout<<" constructor from class A."<<endl;
    }
    void show()
    {
        cout<<" i am show function of class A"<<endl;
    }
};
class B
{
    public:
    B()
    {
        cout<<" constructor from class B ."<<endl;
    }
    void show()
    {
        cout<<" i am show function of class B"<<endl;
    }
};
class C:public A,public B
{
    public:
    C()
    {
        cout<<" constructor from class c ."<<endl;
    }
    void show()
    {
        cout<<" i am show function of class c"<<endl;
    }
};
int main()
{
    C obj;
    obj.A::show();  
    obj.B::show(); 
    obj.C::show();
    return 0;

   
}
 
