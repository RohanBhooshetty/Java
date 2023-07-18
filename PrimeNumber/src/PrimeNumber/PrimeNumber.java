package PrimeNumber;
import java.util.*;
public class PrimeNumber {
	/*public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=scan.nextInt();
		int sum=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			sum+=1;
		}
			if(sum==0)
				System.out.println("prime");
			else
				System.out.println("notprime");
			scan.close();*/
	// anouther method
public static void main(String [] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the the number n to check weather the given number is prime or not");
	int n=scan.nextInt();
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println("The given number is not prime ");
			return;
		}
	}
	System.out.println("the given number is prime number");
	scan.close();
}
}