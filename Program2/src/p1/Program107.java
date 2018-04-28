package p1;

public class Program107 {
	public static void main(String args[]) {
		
		int n;
		double x=0.83;
		
		for(int i=0; i<25; i++) {
			x=x*0.83;
			n=(int) (10*x);
			n=n+1;
			n=220/n;
			System.out.println(n);
		}
	}
}
