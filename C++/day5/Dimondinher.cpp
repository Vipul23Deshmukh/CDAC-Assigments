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
    void eat1()
    {
        cout<<" elephants are vegetarian .they eat fruits."<<endl;
    }
    void features1()
    {
        cout<<" they are heavy.lives with each other."<<endl;
    }
};
class Lion:public Animal
{
    public:
    void eat2()
    {
        cout<<" lions are non vegetarian.they eat meat."<<endl;
    }
    void feature2()
    {
        cout<<" he is king of forest.."<<endl;
    }
};


class Diomond: public Elephant,public Lion{


     public:
    void rear()
    {
        cout<<" Diamond are rare."<<endl;
    }
    void feature3()
    {
        cout<<" Diamond are expensive."<<endl;
    }

};
int main()
{
    Animal a;
    Elephant e;
    Lion l;
    Diomond d;
    cout<<" animal class "<<endl;
  //  a.home();
    cout<<" elephant class "<<endl;
    //e.home();
  //  e.eat();
   // e.features();
    cout<<" lion class "<<endl;
     cout<<" Dimond  class "<<endl;
   // l.home();
   // l.eat();
   // l.feature();
    d.rear();
    d.feature3();
    //d.home(); error
    d.eat1();
    d.features1();
    d.feature2();
    d.eat1();
}