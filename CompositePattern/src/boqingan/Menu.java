package boqingan;

import java.util.*;
// 实现组合(Composite)菜单
public class Menu extends MenuComponent{
    protected ArrayList menuComponents = new ArrayList();
    protected String name;
    protected String description;

    public Menu(String name ,String description){
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent mc){
        menuComponents.add(mc);
    }

    public void remove(MenuComponent mc){
        menuComponents.remove(mc);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void print(){
        System.out.print(" \n" + getName());
        System.out.println(" ," + getDescription());
        System.out.println("---------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
    
    public Iterator createIterator(){
    	return new CompositeIterator(menuComponents.iterator());
    }
}
