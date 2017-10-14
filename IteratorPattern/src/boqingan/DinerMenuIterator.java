package boqingan;
import java.util.Iterator;
public class DinerMenuIterator implements Iterator{
	private MenuItem[] items;
	private int position = 0;
	public DinerMenuIterator(MenuItem[] items){
		this.items = items;
	}
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null){
			return false;
		}else{
			return true;
		}
	}
	@Override
	public Object next() {
		MenuItem item = items[position++];
		return item;
	}

	@Override
	public void remove() {
		if(position < 0 ){
			throw new IllegalStateException("no item to remove");
		}else if(items[position-1] != null){
			for(int i = position-1;i<(items.length-1);i++){
				items[i] = items[i+1];
			}
			items[items.length-1] =  null;
		}
	}

}
