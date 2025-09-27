#include<iostream>
#include<stdlib.h>
using namespace std;


int main()
{
    
    int n,i;
    int* ptr;

    cout<<" enter number of elements :"<<endl;
    cin>>n;
    
    ptr=(int*) malloc(n*sizeof(int));

    
      for(i=0;i<n;i++)
      {
        cin>>ptr[i];
      }



      cout<<" array elements are: "<<endl;
      for(i=0;i<n;i++)
      {
        cout<<ptr[i]<<endl;
      }


           free(ptr);

}