package allTypeQuestion;

public class SwapNumber {
   public static void main(String[] args) {
	int x=20,y=10,z;
//	without using third variable
//	 x=x+y;
//     x=x-y;
//     y=x-y;
	 z=y;
	 y=x;
	 x=z;
     System.out.println(x+" "+y);
}
}
