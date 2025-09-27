#include<iostream>
using namespace std;
static int count=0;
class Des{

    public:
    Des()
    {
        count++;
        cout<<" this is constructor ..."<<endl;
        cout<<" count = "<<count<<endl;
    }
    ~Des()
    {
       
        cout<<" this is destructor..."<<endl;
        cout<<" count = "<<count<<endl;
        count--;
    }
};

int main()
{
    Des d;
    Des d1,d2,d3,d4;
}