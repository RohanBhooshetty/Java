package FactorialOfNumber;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args0) {
		Scanner scan=new Scanner(System.in);
		System.out.println("entre the value of n");
		int n=scan.nextInt();
		int product=1;
		for(int i=1;i<=n;i++)
		{
		product	= product*i;
		}
		System.out.println(product);
		scan.close();
}
}
	