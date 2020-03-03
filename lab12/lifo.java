package lab12;

import java.util.ArrayList;

public class lifo <T>{
	private ArrayList<T> list = new ArrayList<>();
	
	public void push(T o) {
		list.add(o);
	}
	
	public T pop() {
		T o = list.get(list.size()-1);
		list.remove(list.size()-1);
		return o;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "LIFO [list=" + list + "]";
	}
	
}

