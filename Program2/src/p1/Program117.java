package p1;

public class Program117 {
	public static void main(String args[]) {
		int diff = 100;
		int num;
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2}; 
		
		for(int i=0; i<data.length; i++) {
			if(data[i] < 0) {
				num = data[i] * -1;
				if(diff<num) {
					diff = data[i];
				}
			}
			else {
				if(diff>data[i]) {
					diff = data[i];
				}
			}
		}
		System.out.println(data[1]);
	}
}
