package lab4_assignment;

public class Occurrences {
	String str;
	int[] cnt;
	
	public Occurrences(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	public void OccurrencesCount(String str) {
		char[] arr = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			if(arr[i] >= '0' && arr[i] <= '9')
				cnt[arr[i]]++; 
		}
		for(int i = 0; i <= 9; i++) {
			System.out.println(cnt[i]);
		}
	}

}
