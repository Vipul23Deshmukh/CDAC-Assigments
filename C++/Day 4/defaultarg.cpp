#include<iostream>
using namespace std;
void add(int ,int=4,int=5,int=10);
int main()
{
  
    add(1,4);
    add(10,20,30);
    add(1,2,3,4);
}
void add(int a, int b,int c,int d)
{
    cout<<a+b+c+d<<endl;
}