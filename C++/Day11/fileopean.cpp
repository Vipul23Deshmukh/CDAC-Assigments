
#include <iostream>
#include <fstream>
using namespace std; 
int main() {

    // opening a text file for writing
    ifstream my_file("example1.txt");
    if (!my_file.is_open()) {
    cout << "Error opening the file." << endl;
	}
    // close the file
    my_file.close();
    return 0;
}
