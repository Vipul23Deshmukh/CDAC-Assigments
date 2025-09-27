#include<iostream>
using namespace std;
class base
{

    public:

    virtual void display()
    {
        cout<<" virtual base class"<<endl;
    }
    

};
class child:public base{

    public:
    void display()
    {
        cout<<" overriden display of child"<<endl;
    }
      
};
int main()
{
    child c;
    c.display();
   
    base b;
    b.display();

    base* b1;
    child c1;
    b1=&c1;
    b1->display();

}
