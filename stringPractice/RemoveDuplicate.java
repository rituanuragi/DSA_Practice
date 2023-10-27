package stringPractice;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str="geeksforgeeks";
		String ans="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ans.indexOf(ch)==-1) {
				ans+=ch;
			}
		}
		System.out.println(ans);
	}
}
