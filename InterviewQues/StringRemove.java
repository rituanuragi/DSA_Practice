package allTypeQuestion;

public class StringRemove {
   public static void main(String[] args) {
//	String str="Ram is";
//	String res=str.replace("a","");
//	System.out.println(res);
//}

       StringBuilder MyString = new StringBuilder("Hello World");
       System.out.println("The string before removing character: " + MyString);
       MyString = MyString.deleteCharAt(5);
       System.out.println("The string after removing character: " + MyString);
  }
} 

