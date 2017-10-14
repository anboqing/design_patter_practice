/*************************************************************************
	> File Name: graphic.h
	> Author: HunkAnn
	> Mail: hunkann@gmail.com 453775948@qq.com 
	> Created Time: Mon 30 Mar 2015 10:35:52 AM CST
 ************************************************************************/

#ifndef __GRAPHIC_H__
#define __GRAPHIC_H__

#include <iostream>

class Point{
private:
    int _x;
    int _y;
public:
    Point(int x,int y):_x(x),_y(y){}
    int getX(){return _x;}
    int getY(){return _y;}
}
class Graphic {
public:
    virtual ~Graphic();
    virtual void draw(const Point& at) = 0;
    virtual void handleMouse(Event& event) = 0;
    virtual const Point& getExtent() = 0;

    virtual void Load(std::istream& from) = 0;
    virtual void Save(std::ostream& to) = 0;
protected:
    Graphic();
}


#endif

