package p1;

public class Program116 {
	public static void main(String args[]) {
		
		int largest = 0;
		int smallest = 100;
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
		
		//largest
		for(int i=0; i<data.length; i++) {
			if(largest<data[i]) {
				largest = data[i];
			}
		}
		//smallest
		for(int i=0; i<data.length; i++) {
			if(smallest>data[i]) {
				smallest = data[i];
			}
		}
		
		System.out.println("Largest: " + largest + " Smallest: " + smallest);
	}
}
