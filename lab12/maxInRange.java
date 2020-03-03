/* Write a generic method to find the maximal element in the range [begin, end) of a list. */

package lab12;

import java.util.ArrayList;
import java.util.List;

public class maxInRange {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<12;i++) {
			list.add(i);
		}
		Integer i = max(list,3,6);
		System.out.println(i);
	}
	
	
	public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list, int begin, int end) {
	    T maxElem = list.get(begin);
	    for (++begin; begin < end; ++begin)
	    	if (maxElem.compareTo(list.get(begin)) < 0)
	    		maxElem = list.get(begin);
	    return maxElem;
	 }
}

