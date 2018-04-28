package p1;
import java.util.Scanner;

public class Program105 {
	public static void main(String args[]) {
		
		boolean upper=false;
		boolean lower=false;
		boolean digit=false;
		boolean quit=true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the password");
		String pass = scanner.nextLine();
		
		while(quit) {
			if(pass.length()<7) {
				System.out.println("password not acceptable");
				System.out.println("Enter the password");
				pass=scanner.nextLine();
			}
			for(int i=0; i<pass.length(); i++) {
				if(Character.isUpperCase(pass.charAt(i))) {
					upper=true;
				}
				if(Character.isLowerCase(pass.charAt(i))) {	
					lower=true;
				} 
				if(Character.isDigit(pass.charAt(i))) {
					digit=true;
				}
			}
			if(!upper || !lower || !digit) {
				System.out.println("password is not acceptable");
				System.out.println("Enter the password");
				pass=scanner.nextLine();
			}
			else {
				quit=true;
			}
		}
		scanner.close();
	}
}
