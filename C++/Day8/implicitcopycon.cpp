#include<iostream>
using namespace std;
class sample{

    int a;
    public:
   void value(int x)
    {
        a=x;
    }
    void display()
    {
        cout<<" value of a="<<a<<endl;
    }

};
int main()
{
   sample c1;
   c1.value(10);
   c1.display();

   sample s1(c1);  //copy constructor

   s1.value(5);
   s1.display();

}