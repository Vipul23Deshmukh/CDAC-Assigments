#include<iostream>
using namespace std;
int main(){

    cout<<" checking if number is prime or not..."<<endl;

    int n;
    cout<<" enter the number :"<<endl;
    cin>>n;

    if(n==0 || n==1|| n%2==0 && n!=2)
    {
         cout<<" not prime number.";

       
    }
    
    else
    {
        cout<<" prime....";
    }
}
