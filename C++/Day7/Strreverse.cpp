#include<iostream>
#include<String.h>
using namespace std;
int main()
{
    char s1[20]=" Hello World";
    int x = strlen(s1)-1;
     char s2[20];

    int y=0;
    while(x>=0)

    {
        s2[y]=s1[x];
        x--;
        y++;
    }
   s2[y]='\0';
    cout<<s2;

   
}