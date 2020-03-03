package lab12;

import java.util.ArrayList;

public class removeDuplicates {
	
    public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<>();
		
		for(int i=1;i<=7;i++) {
			ints.add(i);
		}
		
		ints.add(2);
		ints.add(4);
		ints.add(6);
		//Before remove
		for(int i: ints) {
			System.out.print(i);
		}
		System.out.println();
		ints = removeDuplicates(ints);
		//After remove
		for(int i: ints) {
			System.out.print(i);
		}
	}
    
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
    	ArrayList<E> newList = new ArrayList<E>();
    	for(E element: list) {
    		if(!newList.contains(element)) {
    			newList.add(element);
    		}
    	}
		return newList;	
    }
}
