#include <iostream>
using namespace std;
int main()
{
 int a=0,  b=1,n;
 int sum =a+b;
  cout<<"Enter the number";
  cin>>n;

  cout<<"Fibonacci Series:  "<<a<<"\t"<< b<<"\t";

  for(int i=0;i<=n;i++)
  {
    b=a;
    a=sum;
    sum=a+b;
    cout<<sum<<"\t";
  }


}