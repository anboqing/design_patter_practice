#include <iostream>
using namespace std;
class Base{
public:
    Base(){
        cout << "Base constructor"<<endl;
    }
    virtual void func(){
        cout << "Base virtual function"<<endl;
    }
    void function(){
        cout << "Base common function " << endl;
    }
};

class Extend:public Base{
public:
    Extend(){
        cout << "Extend constructor" << endl;
    }
    void func(){
        cout << "Extend virtual function"<<endl;
    }
    void function(){
        cout << "Extend common function " << endl;
    }
};


