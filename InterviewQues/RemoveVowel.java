package allTypeQuestion;

public class RemoveVowel {
	public static void main(String[] args) {
		
//	
//  String str="ram";
//  String remove=str.replaceAll("[aeiouAEIOU]","");
//		  System.out.println(remove);;
//	  }
//}
  String s="ram is a boy";
  for(int i=0;i<s.length();i++) {
	  if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
              || s.charAt(i) == 'i' || s.charAt(i) == 'o'
              || s.charAt(i) == 'u' || s.charAt(i) == 'A'
              || s.charAt(i) == 'E' || s.charAt(i) == 'I'
              || s.charAt(i) == 'O'
              || s.charAt(i) == 'U') {
		  continue;
		  
	  }
	  else {
		  System.out.print(s.charAt(i));
	  }
  }
	}}