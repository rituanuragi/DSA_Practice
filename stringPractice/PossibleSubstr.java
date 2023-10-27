package stringPractice;
import java.util.*;
public class PossibleSubstr {
	public static void main(String[] args) {
		String str="geeksforgeeks";
		int n=3;
		for(int i=0;i<str.length()-n+1;i++) {
				System.out.println(str.substring(i,i+n));
			}
		}

}
