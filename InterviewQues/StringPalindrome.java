package allTypeQuestion;

class StringPalindrome {
//	public static void main(String[] args) {
//	String str = "abba", reverseStr = "";
//    
//    for (int i = str.length() - 1; i >=0; --i) {
//      reverseStr = reverseStr + str.charAt(i);
//    }
//
//    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
//      System.out.println(str + " is a Palindrome String.");
//    }	
//    else {
//      System.out.println(str + " is not a Palindrome String.");
//    }
//  }
//}
	public static boolean isPalindrome(String str) {
		for(int i=0;i<str.length()/2;i++) {
			int n=str.length();
			if(str.charAt(i)!=str.charAt(n-i-1)) {
				return false;
			}
				
			}
		return true;
		}
	public static void main(String[] args) {
		String str="noon";
		System.out.println(isPalindrome(str));
	}
	}