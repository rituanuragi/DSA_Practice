package allTypeQuestion;

import java.util.Arrays;

class StringAnagram {
//	static boolean areAnagram(char str1[],char str2[]) {
//		int n1=str1.length;
//		int n2=str2.length;
//		if(n1!=n2)
//			return false;
//		Arrays.sort(str1);
//		Arrays.sort(str2);
//		
//		for(int i=0;i<n1;i++)
//			if(str1[i]!=str2[i])
//					return false;
//			return true;
//		
//	
//	}
//	public static void main(String[] args) {
//		char str1[]= {'p','r','a','k'};
//		char str2[]= {'a','p','r','t'};
//		if(areAnagram(str1, str2)) 
//			System.out.println("anagram");
//		else
//			System.out.println("not");
//		
//	}
//}
//  
	 static void isAnagram(String s1,String s2) {
		String str1=s1.replaceAll("//s", "");
		String str2=s2.replaceAll("//s", "");
		boolean status=true;
		
		if(str1.length()!=str2.length()) {
		    status=false;}
		
		else {
			char arr1[]=str1.toLowerCase().toCharArray();
			char arr2[]=str1.toLowerCase().toCharArray();
			Arrays.sort(arr1);    
			//sorts the character array arrayS2  
			Arrays.sort(arr2);  
		
		status=Arrays.equals(arr1, arr2);
		}
		if(status)
			System.out.println("anagram");
		else
			System.out.println("not");
		
	}
 public static void main(String[] args) {
	isAnagram("cat","tac");
	isAnagram("mount","oumt");
	
}
}
