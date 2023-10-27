package stringPractice;

public class VowelCount {
	public static void main(String[] args) {
	String str="GreatResponsibility";
	int vowelCount=0;
	int upperCaseCount=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' ) {
			vowelCount++;
		}
		else if(ch>='A' && ch<='Z') {
			upperCaseCount++;
		}
	}
	System.out.println(vowelCount);
	System.out.println(upperCaseCount);
	}
	
}