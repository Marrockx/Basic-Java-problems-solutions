package Tutorial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LoanCalculator {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter loan Amount in Naira(N): ");
		double loanAmount = sc.nextDouble();
		//System.out.println(" loan Amount is: " + loanAmount);
		
		System.out.println("Enter Annual Interest Rate in % : ");
		double annualIntrate = sc.nextDouble();
		
		System.out.println("Enter loan Period in Years: ");
		int loanPeriod = sc.nextInt();
		
		double simpleInterest = (loanAmount * annualIntrate * loanPeriod) / 100;
		
		double yearlyPayment = (loanAmount + simpleInterest);
		
		double monthlyPayment = yearlyPayment/12;// divide by 12months to get for each month
		
		double totalPayment = yearlyPayment * loanPeriod ;
		DecimalFormat df = new DecimalFormat("000,000.000");
		System.out.println("The Monthly Payment for the Loan is: N" 
		+ df.format(monthlyPayment) + 
				" and \nThe Yearly Payment is: N" + df.format(totalPayment));
		
	}
 

}
