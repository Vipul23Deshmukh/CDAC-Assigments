#include<iostream>
using namespace std;
class Animal{

    private:
    int forestid;

    public:
    int getfid()
    {
        return forestid;
    }

    void home()
    {
        cout<<"all animals lives in forest"<<endl;
    }
};
class Elephant:public Animal
{
    public:
    void eat()
    {
        cout<<" elephants are vegetarian .they eat fruits."<<endl;
    }
    void features()
    {
        cout<<" they are heavy.lives with each other."<<endl;
    }
};
class Lion:public Animal
{
    public:
    void eat()
    {
        cout<<" lions are non vegetarian.they eat meat."<<endl;
    }
    void feature()
    {
        cout<<" he is king of forest.."<<endl;
    }
};
int main()
{
    Animal a;
    Elephant e;
    Lion l;
    cout<<" animal class "<<endl;
    a.home();
    cout<<" elephant class "<<endl;
    e.home();
    e.eat();
    e.features();
    cout<<" lion class "<<endl;
    l.home();
    l.eat();
    l.feature();
}