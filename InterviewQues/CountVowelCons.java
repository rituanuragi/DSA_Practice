package allTypeQuestion;

public class CountVowelCons {
  public static void main(String[] args) {
	  int count1=0;
	  int count2=0;
	String str="Quescol Website";
 	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
		        || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' ) {
			count1++;
		}
		else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			count2++;
		}
	}
		System.out.println(count1+" "+count2);
		
	
}
}
