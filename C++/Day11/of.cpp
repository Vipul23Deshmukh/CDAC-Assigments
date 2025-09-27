#include<iostream>
#include<fstream>
using namespace std;
int main(){

// opeaning file
   // ifstream my_file("of.txt");
    cout<<"the file created sucessfully"<<endl;

    ofstream my_file("of.txt");
    my_file<<"this is line one"<<endl;
    //,ios::app
    
    //closeimg file
    my_file.close();

}