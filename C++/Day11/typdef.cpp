#include<iostream>
using namespace std;
int main()
{
    typedef int arr[5];
    arr array{1,4,3,2,8};

    cout<<" array elements : "<<endl;

    for(int i=0;i<=5;i++)
    {
        cout<<array[i]<<"\t";
    }
}