#include<iostream>
using namespace std;
class parent{

 public:

 void func(){
    cout<<" this function belong to the parent class"<<"\n"<<endl;

 }

};

class Child:public parent{

public:
    void func(){

        cout<<"this function belongs to the child class"<<"n"<<endl;
    }
};


int main(){


     parent a;
     Child c;

     a.func();
     c.func();
}