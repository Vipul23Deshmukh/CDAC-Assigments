#include<iostream>
using namespace std;

class Base{

private : 
int pvt=10;

public :
int pub=20;
int getPVT() 
{return pvt;};

protected:

int prot=40;



};

class Derived:protected Base
{
public:
int getProt() {return prot;};
int getpublic() {return pub;};

};

int main(){

        Derived obj;
        obj.getpublic();
        obj.getProt();
        //obj.getPVT();

    cout<<obj.getpublic()<<endl;
    cout<<obj.getProt()<<endl;
    //cout<<obj.getPVT()<<endl;


}

