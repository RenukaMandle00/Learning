
public class CalDilemma {

	
     void Calculator(int num1, int num2, char sign) 
     {
    	 switch(sign) {
    	 
    	 case '+':
    	 System.out.println("Addition is " + (num1 + num2));
    	 break;
    	 
 	     case '-':
 		 System.out.println("Subtraction is " + (num1 - num2));
    	 break;
    	
    	 case '*':
    	 System.out.println("Multiplication is " + num1*num2);
    	 break;
    	 
    	 case '/':
    	 System.out.println("Division is " + (num1/num2));
    	 break;
    	 
    	 default:
    		 System.out.println("invalid");
    		 break;
    	 
    	 }
     }
}
