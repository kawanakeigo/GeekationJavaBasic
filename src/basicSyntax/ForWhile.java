package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for ( int num = 1; num <=100; num++  ) {
		//int [] numbers = {int num = 1; num <=100; num++ 
				if( num % 3 == 0 ) {
					System.out.println("Fizz");
				}

				else if(num % 5==0) {
					System.out.println("Buzz");
				}
				else if( num % 3 ==0 && num % 5 ==0) {
					System.out.println("FizzBuzz");
				} else {
					
				
				System.out.println(num);
			
			}
			
			
			
		}
		

	}

}
