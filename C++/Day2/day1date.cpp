#include<iostream>
using namespace std;
class Date
{
	int dd,mm,yy;
	public:
		void accept();
		void display();
		void setd(int);
		int getd();
};

void Date::accept()
{
	cout<<" Enter date ";
	cin>>dd>>mm>>yy;
}

void Date::display()
{
	cout<<" Toda's date is "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
void Date:: setd(int d)
{
	dd=d;
}
int Date:: getd()
{
	return dd;
}
int main()
{
	Date d1;
	d1.accept();
	d1.display();
	d1.setd(21);
	int da=d1.getd();
	cout<<" Date = "<<da;
}
