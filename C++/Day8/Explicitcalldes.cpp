#include<iostream>
using namespace std;
class des
{
    public:
    des()
    {
        cout<<" constructor... "<<endl;
    }
    ~des()
    {
        cout<<" destructor..."<<endl;
    }
};
int main()
{
    des s;
    s.~des();
}
