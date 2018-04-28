package p1;

public class Program114 {
	public static void main(String args[]) {
		
		int[] val = {0, 1, 2, 3};
		int temp;
		
		System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
		
		val[0]=val[3];
		val[2]=val[1];
		System.out.println("Reversed Array: " + val[0] + " " + "2" + " " + val[2] + " 0");
	}
}
