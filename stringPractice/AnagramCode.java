package stringPractice;

import java.util.Arrays;

public class AnagramCode {
	public static void main(String[] args) {
		String str1="race";
		String str2="care";
		if(str1.length()!=str2.length()) {
			System.out.println("not");
			return;
		
	}
			char [] arr=str1.toCharArray();
		
		Arrays.sort(arr);
		char [] arr1=str2.toCharArray();
		Arrays.sort(arr1);
		if(Arrays.equals(arr1,arr)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("NOT");
		}
		
	}	
		
}
