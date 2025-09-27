#include<iostream>
using namespace std;
class Complex{

int real, img;
public :
void accept();
void display();
void setr( int real);
int getr();


};

void Complex :: accept()
{
    cout<<" enter the value";
    cin>>real>>img;
    
}
void Complex ::display()
{
cout<<" complex no is "<<real<<"+"<<img<<"i\n"<<endl;
   
}

void Complex ::setr(int r)

{
real =r;
    
}
 int  Complex ::getr(){

 return real;

}
int main() {

    Complex c1;
    c1.accept();
    c1.display();
    c1.setr(3);
    // int a=c1.getr();
   cout<<c1.getr()<<endl;


}