
public class Test9 {

	public static void main(String[] args) {
		
		//强制类型转换有可能造成数据精度的丢失
		double d = 123.85;
		int i;
		i = (int)d;
		
		System.out.println(i);//123
	}
	
}
