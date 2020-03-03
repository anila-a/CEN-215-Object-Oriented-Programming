package lab12;

public class testTwoItems {
	
    public static void main(String[] args) {
    	twoItems<String> twoNames = new twoItems<>("John", "Jane");
    	
    	System.out.printf("twoNames=%s.%n", twoNames);
    	String name1 = twoNames.getItem1(); // Value is "John"
    	String name2 = twoNames.getItem2(); // Value is "Jane"
    	
    	System.out.printf(" First item: %s.%n", name1);
    	System.out.printf(" Second item: %s.%n", name2);
    	
    	twoItems<Integer> twoNums = new twoItems<>(5, 7);
    	
    	System.out.printf("twoNums=%s.%n", twoNums);
    	Integer num1 = twoNums.getItem1(); // Value is 4
    	Integer num2 = twoNums.getItem2(); // Value is 7
    	
    	System.out.printf(" First item: %s.%n", num1);
    	System.out.printf(" Second item: %s.%n", num2);
	}
}

