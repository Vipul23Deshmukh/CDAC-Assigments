#include<iostream>
using namespace std;
class Student{
    int rollno;
    char name[20];
    public:
    void accept()
    {
        cout<<" enter roll no: ";
        cin>>rollno;
        cout<<" enter name: ";
        cin>>name;
    }
    void display()
    {
        cout<<" Roll no= "<<rollno<<"\t"<<" Sname="<<name<<endl;
    }
    ~Student()
    {
        cout<<" Destrustor is called ";
    }
};
int main()
{
    int n,r;
     
    cout<<" enter no of students = ";
    cin>>n;
 Student *s=new Student[n];
    cout<<" Accept details :"<<endl;

    for(int i=0;i<=n;i++)
    {
        s[i].accept();
    }

    cout<<" Display details ..."<<endl;
     for(int i=0;i<=n;i++)
    {
        s[i].display();
    }
  delete [] s;
    
}