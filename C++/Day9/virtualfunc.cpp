#include<iostream>
using namespace std;
class Device {
public:
    virtual void playSound() {
        cout << "Generic device sound";
    }
};

class Radio : public Device {
public:
    void playSound() {
        cout << "Playing radio music";
    }
};
int main()
{

Device* d = new Radio();
Device* d1=new Device();
d1->playSound();
d->playSound();
}
