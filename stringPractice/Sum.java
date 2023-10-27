package stringPractice;

public class Sum {
public static void main(String[] args) {
//	String str="111";
//	String str1="222";
//	Integer.parseInt(str);
//	Integer.parseInt(str1);
//	int sum=Integer.parseInt(str)+Integer.parseInt(str1);
//	System.out.println(sum);
//	System.out.println(String.valueOf(sum));
//	
//	
//}
}
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