package lab12;

public class twoItems <T>{
	
	T item1;
	T item2;
	
	public twoItems(T item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}

	public T getItem1() {
		return item1;
	}

	public T getItem2() {
		return item2;
	}

	@Override
	public String toString() {
		return "TwoItems [Item1=" + item1 + ", Item2=" + item2 + "]";
	}

}

