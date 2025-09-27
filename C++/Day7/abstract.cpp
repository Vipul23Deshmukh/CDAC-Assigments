#include<iostream>
using namespace std;
class parent{
    public:

    parent()
    {
        cout<<" this is parent class"<<endl;
    }
    virtual void display()=0;

    //this is pure virtual function so class becomes an abstract class

};
class child: public parent{

    public:
    child()
    {
        cout<<" this is child class"<<endl;
    }
    void display()
    {
        cout<<" i am from abstract class"<<endl;
    }
};

int main()
{
    child c;
    c.display();
}