
public class TaxCalApp {
	double TotalCost; 
	public static double calculateTotalWithTax(double purchaseAmount, double taxRate) {
		 double TotalCost = (purchaseAmount*taxRate)+ purchaseAmount;
		 return TotalCost;
		
	}

}