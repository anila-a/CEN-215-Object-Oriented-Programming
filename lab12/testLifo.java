package lab12;

public class testLifo {
    public static void main(String[] args) {
    	
		lifo<String> listStrings = new lifo<String>();
		lifo<Double> listDouble = new lifo<>();
		
		System.out.println(listStrings.isEmpty());
        System.out.println(listDouble.isEmpty());
        
        listStrings.push("String 1");
        listStrings.push(new String("String 2"));
        listDouble.push(5.4);
        listDouble.push(new Double(3.5));
        
        System.out.println(listStrings);
        System.out.println(listDouble);
        System.out.println(listStrings.pop());
        System.out.println(listDouble.pop());
        
        //After pop
        System.out.println(listStrings);
        System.out.println(listDouble);
	}
}

