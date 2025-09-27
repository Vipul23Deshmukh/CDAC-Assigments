#include<iostream>
using namespace std;
template<class T>
T add(T &a , T &b){

    T result =a+b;
    return result;
}


int main(){

int x=4;

int y=2; 
    
float m=9.7;
float n=8.8;




cout<<"the result of addition is"<<add(x,y);
cout<<"\n";
cout<<"the addition of float no is :"<<add(m,n);
cout<<"\n";
}