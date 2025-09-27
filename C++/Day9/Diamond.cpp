#include<iostream>
using namespace std;
class person
{
    public:
    person(int x)
    {
        cout<<"Person :: person(int) called"<<endl;
        cout<<" A "<<endl;
    }

};
class student:public person
{
     public:
     student(int x):person(x)
     {
        cout<<" Student :: student(int) called"<<endl;
        cout<<" B "<<endl;
     }
};
class teacher:public person
{
    public:
    teacher(int x):person(x)
    {
        cout<<" teacher::teacher(int) called"<<endl;
        cout<<" C "<<endl;
    }

};

class child:public student,public teacher{
    public:
    child(int x):teacher(x),student(x)
    {
        cout<<" child:child(int) called "<<endl;
        cout<<" D "<<endl;
    }
};

int main()
{
    
    child c(40);
}