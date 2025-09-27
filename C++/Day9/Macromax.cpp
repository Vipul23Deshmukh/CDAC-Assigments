#include<iostream>
using namespace std;
#define MAXIMUM(a,b) (a>b)?a:b
int main()
{

    cout<<"MAX(100,500)";
    int k=MAXIMUM(100,500);
    cout<<" maximum number is "<<k<<endl;

    cout<<"MAX(20,50)";
    int n=MAXIMUM(20,50);

    cout<<" maximum nbumber is "<<n<<endl;
}
