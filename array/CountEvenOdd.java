package array;

public class CountEvenOdd {
public static void main(String[] args) {
	 int n = 2335453;
	 int even=0;
	 int odd=0;
	 while(n!=0) {
		 int rem=n%10;
		 if(rem%2==0) 
			 even++;
		 
		 else 
			 odd++;
			 n=n/10;
	 }
		 System.out.println(even);
		 System.out.println(odd);
	 
}
}
//	 int even=0;
//	 int odd=0;
//	 while(n!=0) {
//		 int rem=n%10;
//		 if(rem%2==0) 
//			 even++;
//	     else
//			 odd++;
//			 n=n/10;
//	 }
//	 System.out.println(even);
//	 System.out.println(odd);
//	 
//}
//}
