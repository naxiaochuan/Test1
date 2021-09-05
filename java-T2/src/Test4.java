
public class Test4 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 2;
		
		System.out.println(x+y);//12
		System.out.println(x-y);//8
		System.out.println(x*y);//20
		System.out.println(x/y);//5
		System.out.println(x%3);//1
		
		//整数除法：结果为整数
		System.out.println(15/2);//7
		
		//浮点除法：结果为浮点数
		System.out.println(15.0/2);//7.5
		
		int m = 123;
		//百位+十位+个位的值？？？
		
		//获取百位的数据
		int b = m/100;
		//获取十位的数据
		int s = (m%100)/10;
		//获取个位的数据
		int g = m%10;
		System.out.println(b+s+g);
		
		
		
	}
	
}
