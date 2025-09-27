#include<iostream>
using namespace std;
class Complexcunst{


int real, img;
public :
Complexcunst();
Complexcunst(int , int );

//void accept();
void display() const;
void setr( int real);
int getr();


};
Complexcunst::Complexcunst()
{
  cout<<"This is default constructor"<<endl;
    real=10;
    img=5;
}
 Complexcunst::Complexcunst(int r, int i)
{
    real=r;
    img=i;
    cout<<"This is parameter constructor"<<endl;

}
void Complexcunst ::display() const
{
cout<<" complex no is "<<real<<"+"<<img<<"i\n"<<endl;
   
}

void Complexcunst ::setr(int r)

{
real =r;
    
}
 int  Complexcunst ::getr(){

 return real;

}
int main() {

   const Complexcunst c1;
    Complexcunst c2 (3,4);
   // c1.accept();
    c1.display();
    //c1.setr(3);
    // int a=c1.getr();
   
  
   cout<<c2.getr();
   c2.display();


}