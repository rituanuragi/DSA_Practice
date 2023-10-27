package stringPractice;

public class CompareStr {
public static void main(String[] args) {
	String str1="sanjay";
	String str2="sanjan";
	boolean isCompare=false;
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)!=str2.charAt(i)) {
			isCompare=false;
			break;
		}
		isCompare=true;
	}
	System.out.println(isCompare);
}
}
