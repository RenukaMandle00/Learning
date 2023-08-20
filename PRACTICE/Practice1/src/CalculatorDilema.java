import java.util.Scanner;

public class CalculatorDilema {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
	    int num1 = scan.nextInt();
       System.out.println("Enter sign");
       char sign = scan.next().charAt(0);
       System.out.println("Enter second Number");
      int num2 = scan.nextInt();
  
    
    CalDilemma cd1  = new CalDilemma();
       cd1.Calculator(num1, num2, sign);
    
	}

}
