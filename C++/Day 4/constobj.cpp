#include<iostream>
using namespace std;
class Abc{

    public:
    int a,b;
    Abc()
    {
        cout<<"default constructor"<<endl;

    }
    Abc(int a, int b)
    {
       this->a=a;
       this->b=b;
       cout<<"paramaterized conbstructor "<<endl;
       cout<<a<<b;
    }

};
int main()
{
    Abc abc(10,20);
    abc;
}