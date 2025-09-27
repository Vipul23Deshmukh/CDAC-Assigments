//creating base class object
#include<iostream>
using namespace std;
class base
{
    int version ;
    public:
    base()
    {
        cout<<"base class  default constructor"<<endl;
    }
    base(int a,int b)
    {
        cout<<" base class parameterized constructor"<<endl;
        cout<<" a= "<<a<<" b= "<<b;
        
    }

    void display()
    {
        cout<<" function of base classs"<<endl;
    }

};
class derived:public base
{
    public:
    derived()
    {
        cout<<"derived class  default constructor"<<endl;
    }
    

    void display()
    {
        cout<<" function of derived classs";
    }


};
int main()
{
    base b;
    base(20,30);
    b.display();

    cout<<" base class object only accesss base class attributes and functions.";

}