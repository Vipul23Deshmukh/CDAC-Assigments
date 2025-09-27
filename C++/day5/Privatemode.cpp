#include<iostream>
using namespace std;
class Base
{
    private:
    int p=1;
    protected:
    int pr=2;
    public:
    int pu=3;
     int getp()
     {
        return p;
     }

};
class derived:private Base{

    public:
    int getpr()
    {
        return pr;
    }
    int getpu(){
        return pu;
    }
};
int main()
{
    derived d;
    cout<<" can not access private";
    cout<<" protected = "<<d.getpr(); 
    cout<<" public = "<<d.getpu();

}