
public class Test8 {

	public static void main(String[] args) {
		
		/*
		 * 强制类型转换：大转小
		 * 类型兼容
		 * 目标类型<原类型
		 * 
		 * 目标类型  变量名  =  (目标类型)原类型数据;
		 */
		
		int i = 10;//大水缸
		byte b;//小水缸
		b = (byte)i;
		
		System.out.println(b);
		
	}
	
}
