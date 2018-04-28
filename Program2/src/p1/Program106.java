package p1;
//discord
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program106 {
	public static void main(String args[]) throws FileNotFoundException {
		
		File F = new File("message");
		Scanner scanner = new Scanner(F);
		String key = scanner.nextLine();
		 
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");
			
			for(int i=0; i<tokens.length; i++) {
				int num = Integer.parseInt(tokens[i]);
				char ch = key.charAt(num);
				System.out.print(ch);
			} 
		}
		scanner.close();
	}
}
