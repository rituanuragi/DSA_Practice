package allTypeQuestion;

public class Lcm {
	public static void main(String[] args) {
		int a=4;
		int b=6;
		int h = 0;
		int lcm;
//		for(l=a>b?a:b;l<=a*b;l++) 
//			if(l%a==0 && l%b==0) 
//				break;
//		
//			System.out.println(l);
//	}
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) 
			   h=i;
			
			}
		lcm=a*b/h;
		System.out.println(lcm);
	}	
   
}
