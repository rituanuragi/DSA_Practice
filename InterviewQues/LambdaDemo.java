package allTypeQuestion;

import java.util.function.BiConsumer;

public class LambdaDemo {
  public static void main(String[]args) {
	  BiConsumer<Integer, Integer> biConsumer=(a,b) -> System.out.println(a+b);;
	// TODO Auto-generated method stub
	  biConsumer.accept(5, 10);

}
}
