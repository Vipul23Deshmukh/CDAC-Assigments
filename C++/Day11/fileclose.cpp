#include <iostream>
#include <fstream>
using namespace std; 
int main() {

    // opening a text file for writing
    ifstream my_file("example1.txt");
    // close the file


    if (!my_file) {

    // print error message
    cout << "Error opening the file." << endl;
    // terminate the main() function
    return 1;
}

    my_file.close();
    return 0;
}