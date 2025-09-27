#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<" enter number for elements of an array :"<<endl;
    cin>>n;

    int arr[n];

    cout<<" enetr array elements :"<<endl;

    for(int i=0;i<n;i++)
    {
        cin>>arr[i];

    }

    cout<<" array elements are :"<<endl;

    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<endl;
    }

    cout<<" printing arrray in ascending order : "<<endl;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

     for(int i=0;i<n;i++)
     {
        cout<<arr[i]<<endl;
     }

    
     cout<<" printing arrray in descending order : "<<endl;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

     for(int i=0;i<n;i++)
     {
        cout<<arr[i]<<endl;
     }

    



}