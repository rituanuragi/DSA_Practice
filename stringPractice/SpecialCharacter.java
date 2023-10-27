package stringPractice;

import java.util.Stack;

public class SpecialCharacter {
	public static void main(String[] args) {
     String str="{[]}";
     Stack<Character> s=new Stack<>();
     for(int i=0;i<str.length();i++) {
    	 char ch=str.charAt(i);
    	 if(s.empty()) {
    		 s.push(ch);
    		 
    	 }
    	 else if(ch=='{' || ch=='[' || ch=='(') {
    		 s.push(ch);
    	 }
    	 else if(ch='}' && s.peek()=='{') {
    		 s.pop();
    	 }
    	 else if(ch=']' && s.peek()='[')
    	 {
    		 s.pop();
    		}
     }
    	 if(s.empty()) {
    		 System.out.println("well formed");
    	 }
    	 else {
    		 System.out.println("not well formed");
    	 }
     
	}
	
}
