import java.util.Scanner;

public class BitCounterApp {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = scan.nextInt();
    
    BitCount bit = new BitCount();
    int count = bit.countSetBits(n);
    
    System.out.println(count );
    
	}

}
