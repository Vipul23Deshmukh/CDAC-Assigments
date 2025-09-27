#include<iostream>
using namespace std;
int main(){
 
    int n[5];
    int max=0;
    int first =INT16_MIN;
    int second =INT16_MIN;
    int arr=sizeof(n); //sizeof(n[0]);
    cout<<"enter the elements in the array"<<endl;
    
    
    for (int i=0;i<arr;i++)
    {
        cin>>n[i];
    }
    for (int i = 0; i < arr; i++) {
        if (n[i] > first) {
            second = first;
            first = n[i];
        } else if (n[i] > second && n[i] != first) {
            second = n[i];
            
        }
    }
   if (second==INT16_MIN)
   {
    cout<<"the no second largest no. found  \n"<<endl;
   }
   else{

        cout<<"the second largest no is \n"<< second<<endl;
        return 0;

   }
}

