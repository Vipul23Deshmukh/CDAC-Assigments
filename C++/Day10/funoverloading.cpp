#include<iostream>
using namespace std;
class Student
{
    char name[10];
    public:
    void getname()
    {
        cout<<" enter name: "<<endl;
        cin.getline(name,10);
    }
    void display(int roll,int m1)
    {
        cout<<"name :"<<name<<endl;
        cout<<" Roll = "<<roll<<endl;
        cout<<" Marks of maths = "<<m1<<endl;
    
    }
     void display(int roll,int m1,int m2)
    {

       
       
        cout<<" Roll = "<<roll<<endl;
        cout<<" Marks of maths = "<<m1<<endl;
        cout<<" Marks of DS = "<<m2<<endl;
    }

     void display(int roll,int m1,int m2,int m3)
    {
        cout<<" Roll = "<<roll<<endl;
        cout<<" Marks of maths = "<<m1<<endl;
        cout<<" Marks of DS = "<<m2<<endl;
        cout<<" Marks of OS "<<m3<<endl;
    }

   
    
    
};

int main()
{
    Student s;
    s.getname();
    s.display(1,60);
    s.display(2,80,50);
    s.display(3,90,80,90);
}