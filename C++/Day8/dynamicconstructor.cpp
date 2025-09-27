//dynamic initialization of object.it is done by using constructor and passing different parameters this constructor is known as 
//dynamic constructor.initial value of object is assigned at run time.

#include<iostream>
using namespace std;
class Demo{

    int* ptr;
    public:
    Demo()
    {
        ptr=new int;
        *ptr=20;
    }

    void show()
    {
        cout<<" value of *ptr = "<<*ptr;
        cout<<" ptr = "<<ptr;
    }
};

int main()
{
    Demo d;
    d.show();
}


