package lab12;

public class max2D {
    public static void main(String[] args) {
		Double[][] numbers = {{2.3,9.4,6.7},{1.3,8.7,3.5},{4.7,5.6}};
		Double maxi = max(numbers);
		System.out.println(maxi);
	}
    
    public static <E extends Comparable<E>> E max(E[][] list) {
    	E max=list[0][0];
    	
    	for(int i=0;i<list.length;i++) {
    		for(int j=0;j<list[i].length;j++) {
    			if(list[i][j].compareTo(max)>0) {
    				max=list[i][j];
    			}
    		}
    	}
    	return max;
    }
}

