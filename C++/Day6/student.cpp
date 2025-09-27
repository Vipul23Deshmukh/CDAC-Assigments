#include<iostream>
using namespace std;
int main()
{
    int n,m,sum=0;
    float avg;

    cout<<" enter no of subjects :";
    cin>>n;
    cout<<" enter no of characters :";
    cin>>m;

    int* p_marks=new int[n];
	char* p_name=new char[m+1];

    cout<<" enter marks : ";

    for(int i=0;i<n;i++)
    {
        cin>>p_marks[i];
    }
      for(int i=0;i<n;i++)
    {
        sum=sum+p_marks[i];
        
    }
    avg=sum/n;

    cout<<"enter name :";
    cin>>p_name;

    cout<<"name of student is "<<p_name;
    cout<<" average = "<<avg;

}