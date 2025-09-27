#include<iostream>
#include<string.h>
using namespace std;
int main()
{
     char s[20]="hello world";
     char r[20];
    int i,j;
    
    int n=strlen(s);
    cout<<n<<endl;
   
    for(i=0;i<=n;i++)
    {
        r[i]=s[n-i-1];
        //n++;
    }
   r[n] = '\0';
   cout<<r;

}
