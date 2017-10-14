package boqingan;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

	Stack<Iterator> stack = new Stack<Iterator>();

	/**
	 * @param iterator 将我们要遍历的顶层组合的迭代器传入.我们把它抛进一个堆栈数据结构中.
	 */
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}else{
			/*
			 * 从栈顶中取出迭代器,看看是否还有下一个元素.
			 * 如果它没有元素,我们就将它弹出堆栈,然后递归的调用hasNext()
			 */
			Iterator iterator = (Iterator)stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				//否则表示还有下一个元素,我们返回true;
				return true;
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 * 
	 */
	public Object next() {
		//当客户想要取得下一个元素的时候,我们先调用hasNext()来确定是否还有下一个
		if (hasNext()) {
			// 如果还有下一个元素,就从堆栈中取出目前的迭代器,然后取得它的下一个元素.
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu) {
				// 如果元素是一个菜单,则该菜单的子项目都要遍历,所以再入栈
				stack.push(component.createIterator());
			}
			// 无论是否是菜单,都返回该组件
			return component;
		} else {
			return null;
		}
	}

	public void remove() {
		// 只支持遍历
		throw new UnsupportedOperationException();
	}

}
