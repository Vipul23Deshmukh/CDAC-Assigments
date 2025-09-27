#include<iostream>
using namespace std;

class cdate{

int dd,mm,yy;
public:

cdate(){

    dd=mm=yy=0;

}
cdate(int d,int m,int y){

    dd=d;
    mm=m;
    yy=y;
}
void show(){

    cout<<"date="<<dd<<"\tMonth="<<mm<<"\tYear="<<yy<<endl;
}
};


int main(){

 cdate* ptr=new cdate(01,9,2025);
 ptr->show();
 delete ptr;




}