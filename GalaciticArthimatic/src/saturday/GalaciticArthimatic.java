package saturday;
import java.util.Scanner;
public class GalaciticArthimatic {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		long num1=scan.nextInt();
		long num2=scan.nextInt();
		long result=galacticAddition(num1,num2);
		System.out.println(result);
		scan.close();
	}
	public static long galacticAddition(long num1,long num2)
	{
		return num1+num2;
	}
}