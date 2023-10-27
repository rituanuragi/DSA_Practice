package stringPractice;

import java.util.HashMap;

public class highestFreq {
	public static void main(String[]args) {

	String str="testsample";
	char res='a';
	int maxFreq=0;
	int n=str.length();
	int count[]=new int[256];
	for(int i=0;i<n;i++) {
		count[str.charAt(i)]++;
		if(count[str.charAt(i)]>maxFreq) {
			maxFreq=count[str.charAt(i)];
			res=str.charAt(i);
		}
	}
		System.out.println(res);	
	}
}