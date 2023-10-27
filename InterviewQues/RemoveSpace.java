package allTypeQuestion;

public class RemoveSpace {
  public static void main(String[] args) {
	String str="a b c hi gd";
	String name="";
//	for(int i=0;i<str.length();i++) {
//		char ch=str.charAt(i);
//		if(ch==' ') {
		  name=str.replaceAll(" ", "");
		System.out.println(name);	
	
}
}
