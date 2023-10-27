package stringPractice;

public class EvenWord {
public static void main(String[] args) {
	String str="Hell World hiii";
	for(String s:str.split(" ")) {
		if(s.length()%2==0) {
			System.out.println(s);
		}
	}
 }
}
