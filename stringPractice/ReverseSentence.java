package stringPractice;
//import java.util.*;
public class ReverseSentence {
   public static void main(String[] args) {
//	   String s[] = "i like this program very much".split(" ");
//	   String ans="";
//	   for(int i=s.length-1;i>=0;i--) {
//		   ans+= s[i] +" ";
//	   }
//	   System.out.println(ans.substring(0,ans.length()-1));
	   String s = "i like this program very much";
//	   String str[]=s.split(" ");
//	   Collections.reverse(Arrays.asList(str));
//	   System.out.println(String.join(" ", str));
	   String str[]=s.split(" ");
	   for(int i=str.length-1;i>=0;i--) {
		   System.out.println(str[i]);
	   }
}
}
