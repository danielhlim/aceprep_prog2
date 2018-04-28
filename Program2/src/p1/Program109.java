package p1;

import java.util.Scanner;

public class Program109 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		int n = name.length();
		char ch = name.charAt(n-4);
		char ch1 = name.charAt(n-3);
		char ch2 = name.charAt(n-2);
		char ch3 = name.charAt(n-1);
		char ch4 = name.charAt(n-5);
		int check = 0;
		
		if(ch == '.') {
			if(ch1 == 'd') {
				
				if(ch2 == 'a') {
					
					if(ch3 == 't') {
						if(ch4 == ' ') {
							System.out.println(">>>file name missing");
						}
						else {
							String[] tokens = name.split("");
							for(int i=0; i<name.length(); i++) {
								if(tokens[i].equals(" ")) {
									check = 0;
									break;	
								}
								else {
									check = 1;
								}
							}
							if(check==1) {
						 		System.out.println("OK");
							}
							else {
								System.out.println(">>>file name should not contain space");
							}
						}
					}
					else { 
						System.out.println(">>>file name should end with .dat");
					}
				}
				else {
					System.out.println(">>>file name should end with .dat");
				}
			}
			else {
				System.out.println(">>>file name should end with .dat");
			}
		}
		else {
			System.out.println(">>>name should end with .dat");
		}
		scanner.close();
	}
}
