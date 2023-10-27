package stringPractice;

public class CountStr {
public static void main(String[] args) {
	String str="Welcome to java for study";

		int count=0;
		if(str.charAt(0)!=' ') {
			count++;
		}
		for(int i1=0;i1<str.length();i1++) {
		  if(str.charAt(i1)==' ' && str.charAt(i1+1)!=' ') {
			count++;
		}
		}
	
	System.out.println(count);
}
}