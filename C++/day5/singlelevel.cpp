#include<iostream>
using namespace std;
class Base{
    public:
     void display()
     {
        cout<<"this is a base/parent class";
     }
     void show(){
        cout<<"this is show methode";

    
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

int main()

{
    Derived a;
    a.display();
    a.show();
   

}