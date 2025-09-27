#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<" emter no of elements array will contain :"<<endl;
    cin>>n;

    int a[n];
    cout<<" Enter arrray elements...."<<endl;

    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }



    int largest=a[0];
    
    for(int i=0;i<n;i++)
    {
        if(a[i]>largest)
        {
            largest=a[i];
        }
    }

     cout<<" largest element is : "<<largest<<endl;


     int secondlarge=-1;

     
    for(int i=0;i<n;i++)
    {
        if(a[i]!=largest)
        {
            if(secondlarge==-1 || a[i]>secondlarge)
            {
                secondlarge=a[i];
            }
        }
    }
 

     cout<<" second largest element is : "<<secondlarge;


}