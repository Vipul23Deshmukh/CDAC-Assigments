#include<iostream>
using namespace std;
int main()
{
    int n,rem,num;
    int result=0;

    cout<<" enter any number : ";
    cin>>n;
    num=n;

    while(n!=0)
    {
        rem=n%10;
        result=result+rem*rem*rem;
        n=n/10;
    }

    cout<<"  number : "<<result<<endl;

    if(result == num)
    {
        cout<<" armstrong number";
    }
    else{
        cout<<"not armstrong";
    }

}
