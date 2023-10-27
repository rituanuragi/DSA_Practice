package array;
import java.util.Scanner;
public class Login {
 public static void main(String[]args) {
	 String Username;
	 String Password;
	 Password="123";
	 Username="wisdom";
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter usename");
	 String username=sc.next();
	 Scanner sc1=new Scanner(System.in);
	 System.out.println("Enter password");
	 String password=sc1.next();
	 if(username.equals(Username) && password.equals(Password)) {
		 System.out.println("Access Granted! Welcome!");
	 }
	 else if(username.equals(Username)) {
		 System.out.println("invalid password");
	 }
	 else if(password.equals(Password)) {
		 System.out.println("invalid username");
	 }
	 else {
		 System.out.println("Invalid Username & Password!");
	 }

}
}
