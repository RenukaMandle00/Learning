import java.util.Scanner;

public class MethodOverLoadingCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		
		System.out.println("Enter the operator : +,-,*,/");
		int operator = scan.next().charAt(0);
		
		int res1 = Calculator('+', b, a);
		System.out.println("Addition is" + res1);
		int res2 = Calculator(a,'-',b);
		System.out.println("Subtraction is" + res2);

		int res3 = Calculator(a, b, '*');
		System.out.println("Multiplication is" + res3);

		int res4 = Calculator(a, b, '/', (a/b));
		System.out.println("Division is" + res4);


    
	}
	public static int  Calculator(char operator, int b, int a) {
		
		switch (('+')) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            return a / b;
	    default:
				System.out.println("invalid operator");
			
		}
		return a+b;
	}
   public static int Calculator(int a, char operator, int b ) {
		
	   switch ('-') {
       case '+':
           return a + b;
       case '-':
           return a - b;
       case '*':
           return a * b;
       case '/':
           return a / b;
	    default:
				System.out.println("invalid operator");
			
		}
		return a-b;
   }
   
   public static int Calculator(int a, int b, char operator) {
		
	   switch ('*') {
       case '+':
           return a + b;
       case '-':
           return a - b;
       case '*':
           return a * b;
       case '/':
           return a / b;
	    default:
				System.out.println("invalid operator");
			
		}
		
	      return a*b;
  }
   
   public static int Calculator(int a, int b, char operator, int res) {
		
	   switch ('/') {
       case '+':
           return a + b;
       case '-':
           return a - b;
       case '*':
           return a * b;
       case '/':
           return a / b;
	    default:
				System.out.println("invalid operator");
			
		}
		
		return a/b;
 }
}