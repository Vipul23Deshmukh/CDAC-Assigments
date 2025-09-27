
#include <iostream>
#include <fstream>
using namespace std;
int main() {

    // open a text file for writing
    fstream my_file("example1.txt",ios::app);
    
    // check the file for errors
    if(!my_file) {
        cout << "Error: Unable to open the file." << endl;
    }

    // write multiple lines to the file
    my_file << "welcome to file hanling" << endl;
   my_file<<" file handling of C++"<<endl;

     ;
    // close the file
    my_file.close();

    return 0;
}
