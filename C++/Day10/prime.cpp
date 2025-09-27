#include<iostream>
using namespace std;
void printprime(int,int);
bool isprime(int );
int main()
{
    int n1,n2;
    cout<<" Enter two numbers :"<<endl;
    cin>>n1>>n2;
    
     printprime(n1,n2);
    
}
void printprime(int n1,int n2)
{
    if(n1>n2)
    {
        swap(n1,n2);
    }

    for(int i=n1+1;i<n2;++i)
    {
        if(isprime(i))
    
        {
            cout<<i<<"\t";
        }
    }
}
bool isprime(int n)
{
    bool prime=true;

    if(n==0 || n==1)
    {
        return false;
    }

    for(int i=2;i<=n/2;i++)
    {
        if(n%2==0)
        {
            return false;
        }
        return prime;
    }
}