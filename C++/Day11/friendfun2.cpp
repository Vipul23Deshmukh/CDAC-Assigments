#include<iostream>
using namespace std;
class base{
    private:
 int private_var=40;
 protected:
 int protected_var=20;

 public:

 friend void get(base&);

};

void get(base& b)
{
    cout<<" private var of base = "<<b.private_var;
    cout<<" protected var of base = "<<b.protected_var;
}

int main()
{
    base e;
    get(e);
}