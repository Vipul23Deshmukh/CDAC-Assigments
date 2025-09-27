#include<iostream>
using namespace std;
int main()
{
    int n,rem,num;
    int rev=0;

    cout<<" enter any number to check palindrome or not : ";
    cin>>n;
    num=n;
    while(n!=0)
    {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }

    cout<<" reversed number :"<<rev<<endl;
   if(rev==num)
    {
        cout<<" given number  is palindrome"<<endl;
    }
    else{
        cout<<" not palindrome";
    }
}