import java.util.Scanner;

public class taxCalculator {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the purchase amount: ");
    double purchaseAmount = scan.nextDouble();
    
    System.out.println("Enter the tax rate: ");
    double taxRate = scan.nextDouble();

    double TotalCost= TaxCalApp. calculateTotalWithTax( purchaseAmount, taxRate);
    
     
	System.out.println("total cost including tax " + TotalCost);
    
	}

}
