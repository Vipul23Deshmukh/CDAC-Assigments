#include<iostream>
using namespace std;

class complex
{
    int real,img;
    public:
    complex();
    complex(int,int);
    void display();
    complex operator-();

};

complex::complex()
{
   real=img=0;
}

complex::complex(int real,int img)
{
    this->real=real;
    this->img=img;
}
void complex::display()
{
    if(img>0)
    {
    cout<<" complex no = "<<real<<"+"<<img<<"i "<<endl;
    }
    else{
         cout<<" complex no = "<<real<<""<<img<<"i "<<endl;
    }
}

 complex complex::operator-()
{ 
     complex temp;
     temp.real=-this->real;
     temp.img=-this->img;
     return temp;     
}

int main()
{
    complex c1(1,2);
    complex c2(3,4);

    c1.display();
    c2.display();
    cout<<" after decrement ";
    complex c3=-c2;
    c3.display();

}