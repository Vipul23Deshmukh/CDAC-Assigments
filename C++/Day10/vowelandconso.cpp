#include<iostream>
#include <string>
using namespace std;
int main()
{
    cout<<" enter string : "<<endl;
    string s;
    getline(cin,s);

    int v=0;
    int c=0;
  for (char ch:s)
  {
    ch=tolower(ch);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
    {
        v++;
    }
    else{
        c++;
    }
  }
  cout<<" Vowels = "<<v;
  cout<<" consonant = "<<c;
}