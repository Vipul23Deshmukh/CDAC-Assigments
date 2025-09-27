#include<iostream>
using namespace std;

class Base{

 protected:
  int a=10;
  void show1(){

    cout<<"this is protected function"<<endl;
  }

  private:
  int b=20;
  void shows(){

    cout<<"this is private fuction"<<endl;
  }

  friend class Demo;

};

class Demo{


 public :

 int x =2000;
void show(Base &t){
cout<<"this function is present in the democlss"<<endl;

cout<<"the value of protected is "<<t.a<<endl;
cout<<"the value of private is "<<t.b<<endl;
t.show1();
t.shows();
 }



};


int main(){


    Base obj;
    Demo d;
    d.show(obj);
    
}