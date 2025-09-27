#include<iostream>
using namespace std;
enum Day{Sunday ='G',monday='A',tueseday='B',wednesday='C',thusday='D',friday='E',saturday='F'};
int main(){

  enum Day today;

  today=monday;
  cout<<today<<endl;

  switch(today)
  {
   case 65:
   cout<<"Monday"<<endl;
     break;
   case 66:
   cout<<"tuesday"<<endl;
   break;
  }

}