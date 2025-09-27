#include<iostream>
using namespace std;

class mainn{
    int a,b;
    public:
     int get();
    friend void display(mainn& );
};

int mainn::get()
{

    cout<<" enter values : "<<endl;
    cin>>this->a;
    cin>>this->b;
}
void display(mainn & m)
{
        cout<<" a = "<<m.a;
        cout<<"b = "<<m.b;
}

int main()
{
    mainn mm;
    mm.get();
    display(mm);
}