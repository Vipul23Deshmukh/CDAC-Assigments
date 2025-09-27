#include<iostream>
using namespace std;
int main(){
    int marks;
    cout<<" enter your marks: ";
    cin>>marks;

    if(marks>=85 )
    {
        cout<<" First class with distinction ";
    }
    if(marks<85 && marks>=70)
    {
        cout<<" first class ";
    }
    if(marks<70 && marks>=60)
    {
        cout<<" second class ";
    }
    else{
        cout<<"passed";
    }

}