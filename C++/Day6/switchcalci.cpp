#include<iostream>
using namespace std;
int main()
{
    int c;
    cout<<" what you want to do ? select the number .."<<endl;
    cin>>c;
    cout<<" 1.Addition"<<endl;
    cout<<" 2.Subtraction"<<endl;
    cout<<" 3.Multiplication"<<endl;
    cout<<" 4.division"<<endl;
    int a,b;
    cout<<" enter two numbers : "<<endl;
    cin>>a>>b;

    switch(c)
    {
        case 1: 
              { int d=a+b;
               cout<<" Addition = "<<d;
               break;
              }
        
        case 2: 
           {
               int s = a-b;
               cout<<" Subtraction = "<<s;
               break;
           }
        case 3: 
            {
               int m = a*b;
               cout<<" Multiplication = "<<m;
               break;
            }

        case 4: 
            {
               int d2 = a/b;
               cout<<" Division = "<<d2;
               break;
            }
        default:
                cout<<" please enter valid info ....";
    }
}