#include<iostream>
using namespace std;
class parent
{

    public:
     parent()
     {
        cout<<" parents are very strict about studies..."<<endl;
     }
    
};
class teacher
{

    public:
     teacher()
     {
        cout<<" teachers are very strict about studies and discipline."<<endl;
     }
    
};
class child:public teacher,public parent{
    public:
    child()
    {
        cout<<" childrens are ve4ry inocent..."<<endl;
    }
};
int main()
{
    child c;
}