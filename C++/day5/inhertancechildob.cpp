#include<iostream>
using namespace std;

class Parent{

    public:
   
    int p;
    
    

};
class Child : public Parent{
  public:
    int c;
};


int main()

{

 Child obj;
 obj.c=30;
 obj.p=70;

 cout<<"child id  is "<<obj.c<<endl;
 cout<<"Parent class id is "<<obj.p<<endl;
 cout<<sizeof(obj);
}