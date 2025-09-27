#include<iostream>
using namespace  std;
void show();
int x=20;
static int a=99;
int main ()

{
    int y=10;
    static int z=0; //local staticvr
    cout<<x<<endl;
    cout<<y<<endl;
        cout<<z<<endl;
        z++;
            cout<<a<<endl;
            a++;


    show();
    y++;
    x++;
    cout<<x<<y<<endl;


}

void show(){
    cout<<x<<endl;
    x++;
    cout<<x<<endl;
  
    int a=2;
   cout<<a<<endl;
   a++;
   cout<<a<<endl;



}
