import java.util.Scanner;

public class BitwiseSwap {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter First Integer");
    int num1 = scan.nextInt();
    System.out.println("Enter Second Integer");
    int num2 = scan.nextInt();
    
    Swapper sp = new Swapper();
    sp.swapUsingBitwise(num1, num2);
   
	}

}
