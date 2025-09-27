#include<iostream>
using namespace std;
class Solution 
{
public:
    bool isPalindrome(int b) {

       
        int rev=0;
        int n=b;
        int r=0;

        while(b!=0)
        {
            r=b%10;
            rev=rev*10+r;
            b=b/10;
        }
        return n==rev;

       
    }
};
int main()
{
    Solution s;
    int number;
    cout<<" enter number :"<<endl;
    cin>>number;

    if(s.isPalindrome(number))
    {
        cout<<" palindrome";
    }
    else{
        cout<<"not palindrome";
    }
}