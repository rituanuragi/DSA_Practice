package stringPractice;

public class stringPalindrome {
	{
		public static void main(String[] args) {
	      String s="noon";
		    int n=s.length();
		    for(int i=0;i<n/2;i++)
		    {
		        if(s.charAt(i)!=s.charAt(n-1-i)){
		           System.out.println("not");
		        }
		    }
		    System.out.println("yes");
		}
	}

}
