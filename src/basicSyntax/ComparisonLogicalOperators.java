package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 5;
		boolean abhikaku =(a > b);
		
		System.out.println(abhikaku);
		
		
		boolean isSunny =true ;
		boolean isWarm =true ;
		boolean tenki =(isSunny && isWarm);
		System.out.println(tenki);
		
		int x =1;
		int y = 2;
		int z = y % 2;
		boolean hikaku2 =(x > 0 &&  z == 0);
		System.out.println(hikaku2);
		
		boolean hasPermission = !(false);
		System.out.println(hasPermission);
		
		
		
		

	}

}
