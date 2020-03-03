package lab12;

public class linearSearch {
    public static void main(String[] args) {
    	String[] names = {"Jack","Robert", "Edward", "Eddie"};
    	int position = linearSearch(names, "Jack");
    	System.out.println(position);
    	System.out.println(names[position]);
    	Integer[] ints = {1,2,3,4};
    	position = linearSearch(ints, 3);
    	System.out.println(position);
    	System.out.println(ints[position]);
	}
    
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
    	for(int i=0;i<list.length;i++) {
    		if(list[i].compareTo(key)==0) {
    			return i;
    		}
    	}
    	return -1;
    }
}
