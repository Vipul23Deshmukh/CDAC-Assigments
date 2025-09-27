#include<iostream>
using namespace std;
class Bankaccounnt
{

    private:
    double balance;

    public:
    Bankaccounnt()
    {
        balance=0;
    }

    void deposit(double ammount)
    {
        balance += ammount;
    }

    void withdraw(double ammount)
    {
        if(ammount<balance)
        {
            cout<<"withdraw.."<<endl;
        }
        else{
            cout<<"insufficient balance .."<<endl;
        }
    }

    void showbalance()
    {
        
        cout<<" Balance= "<<balance;
    }

};
int main()
{
    double dep;
    Bankaccounnt b;
    cout<<"Enter deposit : ";
    cin>>dep;
    b.deposit(dep);
   // b.deposit(50000);
    b.withdraw(2000);
    b.showbalance();
}