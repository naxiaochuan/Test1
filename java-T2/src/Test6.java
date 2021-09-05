
public class Test6 {

	public static void main(String[] args) {
		
		int m = 7;
		int n = 7;
		
		/*
		 * ++m;
		 * int x = 2*m;
		 */
		int x = 2*++m;
		
		/*
		 * int y = 2*n;
		 * n++;
		 * 
		 * int y = 2*n;
		 * n = n + 1;
		 */
		int y = 2*n++;
		
		System.out.println(x);//16
		System.out.println(y);//14
		
	}
	
}
