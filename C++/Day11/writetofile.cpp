
#include <iostream>
#include <fstream>
using namespace std;
int main() {

    // open a text file for writing
    ofstream my_file("example1.txt");
    
    // check the file for errors
    if(!my_file) {
        cout << "Error: Unable to open the file." << endl;
    }

    // write multiple lines to the file
    my_file << "Line 1" << endl;
    my_file << "Line 2" << endl;
    my_file << "Line 3" << endl;
    my_file<<" line 11"<<endl;

      my_file<<" line 12"<<endl;
        my_file<<" line 13"<<endl;
    // close the file
    my_file.close();

    return 0;
}
