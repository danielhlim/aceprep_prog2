package p1;

import java.util.Scanner;

public class Program108 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		
		int v = 0;
		int c = 0;
		int p = 0;
		int s = 0;
		
		char ch;
		
		for(int i=0; i<word.length(); i++) {
			ch=word.charAt(i);
			
			switch(ch) {
			case 'a':
				v ++;
				break;	
			case 'e':
				v ++;
				break;
			case 'i':
				v++;
				break;
			case 'o':
				v++;
				break;
			case 'u':
				v++;
				break;
			case 'b':
				c ++;
				break;
			case 'c':
				c ++;
				break;
			case 'd':
				c ++;
				break;
			case 'f':
				c++;
				break;
			case 'g':
				c++;
				break;
			case 'h':
				c++;
				break;
			case 'j':
				c++;
				break;
			case 'k':
				c++;
				break;
			case 'l':
				c++;
				break;
			case 'm':
				c++;
				break;
			case 'n':
				c++;
				break;
			case 'p':
				c++;
				break;
			case 'q':
				c++;
				break;
			case 'r':
				c++;
				break;
			case 's':
				c++;
				break;
			case 't':
				c++;
				break;
			case 'v':
				c++;
				break;
			case 'w':
				c++;
				break;
			case 'x':
				c++;
				break;
			case 'z' :
				c++;
				break;
			case '!':
				p++;
				break;
			case '@':
				p++;
				break;
			case '.':
				p++;
				break;
			case ' ':
				s++;
				break;
				}
			}
		System.out.println("constant:" + c + " vowel:" + v + " space:" + s + " punctuation:" + p);
		scanner.close();
		}
	}
	
