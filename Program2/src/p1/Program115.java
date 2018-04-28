package p1;
import java.io.* ;

public class Program115 {
	public static void main(String args[]) {
		
		int even = 0;
		int odd = 0;
		int whole;
		
		int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
		
		for(int i=0; i<data.length; i++) {
			if(data[i]%2 == 0) {
				even = even + data[i];
			}
			else {
				odd = odd + data[i];
			}
		}
		whole = even + odd;
		
		System.out.println("Odd: " + odd + " " + "Even: " + even + " Array: " + whole);
	}
}
