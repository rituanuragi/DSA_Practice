package stringPractice;

import java.util.Arrays;

public class Anagram {
	public static boolean Anagarm(char[] str1,char[] str2) {
	    if(str1.length!=str2.length) 
		   return false;
	
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    for(int i=0;i<str1.length;i++) {
	    	if(str1[i]!=str2[i]) {
	    		return false;
	    	}
	    
	}
	    return true;
}
public static void main(String[] args) {
	char str1[] = {'t', 'e', 's', 't'};
    char str2[] = {'t', 't', 'e', 's'};
	System.out.println(Anagarm(str1, str2));
}
}