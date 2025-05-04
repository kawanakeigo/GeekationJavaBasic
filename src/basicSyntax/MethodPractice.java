package basicSyntax;

public class MethodPractice {

	
	public static int add(int a, int b) {
		int add = a + b;
        return add;
    }
	public static int subtract(int a, int b) {
		int sub =a - b;
        return sub;
    }
	public static int multiply(int a, int b) {
		int mul =a * b;
        return mul;
    }
	public static int divide(int a, int b) {
		int div =a / b;
        return div;
    }
	
	public static void main(String[] args)
	{
		int a = 2;
		int b = 3 ;
		
		int result1 = add(a,b);
		int result2 = subtract(a,b);
		int result3 = multiply(a,b);
		int result4 = divide(a,b);
		
		System.out.println("計算結果は" + result1 + "です。");
		System.out.println("計算結果は" + result2 + "です。");
		System.out.println("計算結果は" + result3 + "です。");
		System.out.println("計算結果は" + result4 + "です。");
	    
	    
	}
	

		

}
