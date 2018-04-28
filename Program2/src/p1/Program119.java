package p1;

public class Program119 {
	public static void main(String args[]) {
		int[] signal = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
		int [] smooth = new int[signal.length];
		
		smooth[0] = (signal[0]+signal[1])/2;
		smooth[signal.length-1] = (signal[11] + signal[10])/2;
		for(int i=1; i<11; i++) {
			smooth[i] = (signal[i] + signal[i-1] + signal[i+1])/3;
		}
		//input
		System.out.print("signal:");
		for(int j=0; j<smooth.length; j++) {
			System.out.print(" " + signal[j]); 
		}
		System.out.println();
		System.out.print("smooth:");
		//output
		for(int j=0; j<smooth.length; j++) {
			System.out.print(" " + smooth[j]);
		}
	}
}
