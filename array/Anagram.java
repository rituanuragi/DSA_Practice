package array;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="prak";
	String s2="aprk";
	char ch1[]=s1.toLowerCase().toCharArray();
	char ch2[]=s2.toLowerCase().toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(Arrays.equals(ch1, ch2)) {
		System.out.println("anagram");
	}
	else {
		System.out.println("Not");
	}
}
}
//	char[] ch1=s1.toLowerCase().toCharArray();
//	char[] ch2=s2.toLowerCase().toCharArray();
//	Arrays.sort(ch1);
//	Arrays.sort(ch2);
//	if(Arrays.equals(ch1, ch2)) {
//		System.out.println("anagram");
//	}else {
//		System.out.println("not");
//	}
//}
//}
//	
	
	
	
	
	
	
	
	
	
	
	