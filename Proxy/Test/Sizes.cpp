/*************************************************************************
	> File Name: Sizes.cpp
	> Author: HunkAnn
	> Mail: hunkann@gmail.com 453775948@qq.com 
	> Created Time: Mon 30 Mar 2015 02:15:51 PM CST
 ************************************************************************/

#include<iostream>
using namespace std;

class NoVirtual{
//    int a;
public:
    void x() const{}
    int i() const{return 1;}
};

class OneVirtual {
//   int a;
public:
    virtual void x() const {}
    int i() const {return 1;}
};

class TwoVirtuals {
  //  int a;
public:
    virtual void x()const{}
    virtual int i() const{return 1;}
};

int main(){
    cout << "int: "<<sizeof(int) << endl;
    cout << "void * " << sizeof(void*)<<endl;
    cout << "Novirtual : " << sizeof(NoVirtual) << endl;
    cout << "OneVirtual : " << sizeof(OneVirtual )<<endl;
    cout << "TwoVirtuals:  "<< sizeof(TwoVirtuals)<<endl;
}

