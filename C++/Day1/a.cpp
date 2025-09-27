#include<iostream>
using namespace  std;
class Student{

    private:
    int math,sci;
    public:
    Student(int m,int s){
        math=m;
        sci=s;

    }

    friend float calculateavg(Student s);
    //friend float Calculateavg();
};

float calculateavg(Student s)
{
    return(s.math+s.sci)/2.0;
    
}

int main(){

    Student s1(88,100);
    cout<<"Avg marks"<<calculateavg(s1)<<endl;

}