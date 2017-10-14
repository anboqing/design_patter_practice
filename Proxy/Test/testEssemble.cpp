/*************************************************************************
	> File Name: test.cpp
	> Author: HunkAnn
	> Mail: hunkann@gmail.com 453775948@qq.com 
	> Created Time: Mon 30 Mar 2015 11:20:19 AM CST
 ************************************************************************/

#include "Base.hpp"
#include<iostream>
using namespace std;
int main(){
   Base* p_base = new Extend(); 
   p_base->func();
   //p_base->function();
}
