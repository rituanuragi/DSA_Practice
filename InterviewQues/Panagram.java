package allTypeQuestion;

import java.util.HashSet;

public class Panagram {
public static void main(String[] args) {
	String str="Bawds jog, flick quartz, vex nymph";
	str=str.toLowerCase()
;	HashSet<Character> h=new HashSet<>();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>='a' && str.charAt(i)<='z') 
			h.add(str.charAt(i));
		
	}
		if(h.size()==26) {
			System.out.println("panagaram");}
		else 
		{
			System.out.println("not");
			
}
}}
