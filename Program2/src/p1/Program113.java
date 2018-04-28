package p1;

public class Program113 {
	public static void main(String args[]) {
		
		int[] valA = {13, -22, 82, 17};
		int[] valB = {0, 0, 0, 0};
		
		for(int i=0; i<3; i++) {
			valB[i] = 25 - valA[i];
		}
		
		System.out.println("valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);
		
	}
}
