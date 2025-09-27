#include<iostream>
#include<string>
#include<fstream>
#include<stdexcept>
#include<vector>
using namespace std;

class Student{
     int rollno;
      string name;
     int marks[3];

     Student(){

     }

     Student( int r=0, string n, int m1,int m2,int m3){

        if(m1<0||m1>100||m2<0||m2>100||m3<0||m3>100)
        
            throw invalid_argument("throw marks ");

            rollno = r;
            name = n;
            marks[0] = m1;
            marks[1] = m2;
            marks[2] = m3;
        
     }

     int getRollNo() const {return rollno;}

     float getAverage() const {return (marks[0]+marks[1]+marks[2])/3.0f ;}

     void display(){

        cout<<"Roll no:"<<rollno<<"name :"<<name<<endl;
        cout<<";marks="<<marks[0]<<","<<"marks="<<marks[1]<<","<<"marks="<<marks[2]<<endl;
        cout<<"Average ="<<getAverage()<<endl;

    }

    void updateMarks(int m1, int m2, int m3 ){
        if(m1<0||m1>100|| m2<0||m2>100||m3<0||m3>100)
        throw invalid_argument("enter valid marks");
        marks[0] = m1;
        marks[1] = m2;
        marks[3] = m3;
     
    }
 Student &operator++(){
    for (int i =0;i<3,++i)
        if(marks[i]<100)
       marks[i]++;
       return *this;

    }
bool operator>(const Student& other )const{
    return this->getAverage()>other.getAverage();

    //save student to file
    void saveOFile(ofstream& out) const{
        out <<rollno<<" "<< name<<" "<<marks[0]<<" "<<marks[1]<<" "<<marks[2]<<" "<<"\n";
    }
}

    void loadFromFile(ifstream& in){
        in>>rollno>>name>> marks[0]>>marks[1]>>marks[2];
    }
 };


 int main(){


    
 }