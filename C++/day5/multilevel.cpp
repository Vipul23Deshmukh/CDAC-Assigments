#include<iostream>
using namespace std;
class Base{
    public:
     void display()
     {
        cout<<"this is a base/parent class"<< endl;
     }
     void show(){
        cout<<"this is show methode"<< endl;

    
     }

     void Access(){

        cout<<"you can access me"<< endl;
     }
     int base=55;

};
class Derived: public Base
{

void getch(int dev)
{
    dev=10;
  
    
}
 


};

class C : public Derived
{

 public:
    void c()
    {
        cout<<" This is c class."<<endl;
      
    }
    
};



int main()

{
    Derived a;
    a.display();
    a.show();
    C obj1;
    obj1.c();
    obj1.Access();
    
   

}