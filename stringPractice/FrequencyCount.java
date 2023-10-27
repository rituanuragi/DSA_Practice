package stringPractice;

import java.util.HashMap;

public class FrequencyCount {
	public static void main(String[] args) {
		String str="Appleae";
		char ch;
		int count;
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			 ch=str.charAt(i);
			
			if(map.containsKey(ch)) {
				 count=map.get(ch);
				   
				map.put(ch, ++count);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
}

}