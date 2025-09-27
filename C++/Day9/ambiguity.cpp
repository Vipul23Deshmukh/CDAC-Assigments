#include<iostream>
using namespace std;
class A{
public:

 void show(){

    cout<<"this is the fun of classs A"<<endl;
 }

};


class B {
public:
void show(){

    cout<<"this is the fun of B classs"<<endl;

}

};
class C : public B,public A{

public:
    void accept(){
        cout<<"this is the classs C"<<endl;
    }
};

int main(){

 
C c1;
//c1.show();
c1.A::show();
c1.B::show();
c1.accept();
cout<<"terminated"<<endl;
}