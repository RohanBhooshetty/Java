package PrintAllFactors;

import java.util.Scanner;

public class PrintAllFactor {
	public static void main(String [] args)
	
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value if n");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		scan.close();
	}

}
