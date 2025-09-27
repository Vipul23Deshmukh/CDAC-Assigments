#include<iostream>
using namespace std;

int main()
{
	int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;j++)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	
	
		for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	cout<<endl;
	

		for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			cout<<i<<"\t";
		}
		cout<<endl;
	}
	cout<<endl;
		
	
	   int k=1;
		for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			cout<<k++<<"\t";
		}
		cout<<endl;
	}
	cout<<endl;
	
		for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			cout<<j<<"\t";
		}
		cout<<endl;
	}
	cout<<endl;


		for(i=1;i<=5;i++)
	{
		for(j=5;j>=i;j--)
		{
			cout<<" * ";
		}
		cout<<endl;
	}


	
}
