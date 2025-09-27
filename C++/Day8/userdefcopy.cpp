#include<iostream>
using namespace std;
class Sample
{
    int dd,mm,yy;
    public:
    void show();
    Sample(int ,int,int );
    Sample( Sample&);

};

Sample::Sample(int d,int m,int y)
{
    dd=d;
    mm=m;
    yy=y;
}

Sample::Sample(Sample& new_d)

{
    this->dd=new_d.dd;
    this->mm=new_d.mm;
    this->yy=new_d.yy;


}

void Sample::show()
{
    cout<<" Date = "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
int main()
{
    Sample s(8,8,25);
    Sample d(s);
    s.show();
    d.show();
}