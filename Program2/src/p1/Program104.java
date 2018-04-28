
package p1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program104 {
	public static void main(String args[]) throws FileNotFoundException {
		File F = new File("myfile");
		Scanner scanner = new Scanner(F);
		
		String str = null;
		while(scanner.hasNextLine()) {
			str = scanner.nextLine();
			
			if(str.startsWith("//")) {
				System.out.println(str);
			}
		}
		
		scanner.close();
	}
}
