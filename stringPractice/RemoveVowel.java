package stringPractice;

public class RemoveVowel {
public static void main(String[] args) {
	String str="welcome to geeksforgeeks";
//	String s=str.replaceAll("[aeiouAEIOU]", "");
//	System.out.println(s);
	
	for(int i=0;i<str.length();i++) {
		char s=str.charAt(i);
		if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u') {
			continue;
		}
		else {
			System.out.print(s);
		}
	}
}
}
