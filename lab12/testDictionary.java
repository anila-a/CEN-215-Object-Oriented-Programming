package lab12;

public class testDictionary {
    public static void main(String[] args) {
		dictionary<Integer, String> dict1 = new dictionary<>();
		dict1.put(1, "Njishi");
		dict1.put(2,"Dyshi");
		dict1.put(3, "Treshi");
		
		for(Object o: dict1.keys()) {
			System.out.println("Key: "+o+" | Value:"+dict1.get((Integer)o));
		}
		
		dictionary<String, String> dict2 = new dictionary<>();
		dict2.put("One", "Nje");
		dict2.put("Two", "Dy");
		dict2.put("Three", "Tre");
		
		for(Object o: dict2.keys()) {
			System.out.println("Key: "+o+" | Values:"+dict2.get((String)o));
		}
	}
}
