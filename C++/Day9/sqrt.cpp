#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    int m;

    cout<<" enter number to find square root :"<<endl;
    cin>>m;

    int n;
    cout<<" enter the exponent to find power :"<<endl;
    cin>>n;

    float s=sqrt(m);
    int p=pow(m,n);

    cout<<" Square root of "<<m<<" is = "<<s<<endl;
    cout<<n<<"th"<<" Power of "<<m<<"="<<p<<endl;

}