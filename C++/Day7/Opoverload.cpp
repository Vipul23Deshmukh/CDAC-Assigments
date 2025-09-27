#include<iostream>
using namespace std;
class complex{

    
    int real,img;
    public:
    complex();
	complex(int,int);
	void display();
    complex operator+(complex &);
};
complex::complex(){
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
    cout<<real<<" + "<<img<<"i"<<endl;

  }
  else

  {
    cout<<real<<""<<img<<"i"<<endl;
  }
   
}
complex complex::operator+(complex & c2_new)
{
	complex temp;
	temp.real=this->real+c2_new.real;
	temp.img=img + c2_new.img;
	return temp;
}



int main()
{
    complex c1(3,4);
    complex c2(5,3);

    c1.display();
    c2.display();
   
    complex c3=c1+c2;
     cout<<" After addition of c1 and c2 ";
     c3.display();
}