#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char s1[10]="hello ";
    char s2[10]=" world";

    cout<<s1;
    cout<<s2;
    cout<<strcat(s1,s2)<<endl;
    cout<<strcmp(s1,s2)<<endl;
    cout<<strcpy(s1,s2)<<endl;
    cout<<strrev(s1)<<endl;
    

    
}