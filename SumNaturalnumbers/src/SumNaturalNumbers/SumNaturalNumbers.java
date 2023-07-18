package SumNaturalNumbers;
import java.util.*;
public class SumNaturalNumbers {
	public static void main(String [] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number n to print sum of first n natural numbers ");
	int n=scan.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		sum=n+i;
	}
	System.out.println(sum);
	scan.close();
	}
}
