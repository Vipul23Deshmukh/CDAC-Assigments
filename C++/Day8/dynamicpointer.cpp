#include<iostream>
using namespace std;
class test{

 int *ptr;
 int size;

 public:
     test();
    int min();
    int max();
    void accept();
    void show();
   



};

test::test()
{
cout<<"Enter number of elements"<<endl;
cin>>size;
 ptr = new int[size];
}

void test::accept()
{
    cout<<"accept elements"<<endl;
    for (int i =0;i<=size;i++)
    {
       cin>>ptr[i];
    }
}

void test::show(){
    cout<<"show elements"<<endl;
    for (int i =0;i<=size;i++)
    {
       cout<<ptr[i];
    }
}

int test ::max()
{
 for (int i = 1; i < size; i++)
 {
    int m=ptr[0];
  if(ptr[i]>m)
  {
  m = ptr[i];
  }
  return m;
 }
 

}

int test ::min()
{
 for (int i = 1; i < size; i++)
 {
    int m=ptr[0];
  if(ptr[i]<m)
  {
  m=  ptr[i];
  }
  return m;
 }
 

}


int main()
{

test t1;
t1.accept();
t1.show();
t1.max();
t1.min();

cout<<"the maximum number is "<<t1.max()<<endl;
cout<<"the minimum number is "<<t1.min()<<endl;



}