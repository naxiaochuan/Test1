
public class Test12 {

	public static void main(String[] args) {
		
		short s = 10;
		
		/*
		 * s-->short
		 * 5-->int
		 * s+5-->short+int-->int
		 * short = short+int;  --> short = int
		 * short = (short)int;
		 */
		s = (short)(s + 5);
		//s += 5;//具有隐式强转功能
		
		System.out.println(s);
		
	}
	
}
