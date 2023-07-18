package ArthimaticOperator;
import java.util.*;
public class ArthimaticOperator {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		double result=subtractNumbers(num1,num2);
		System.out.println(result);
		double result1=addNumbers(num1,num2);
		System.out.println(result1);
		double result2=multiplyNumbers(num1,num2);
		System.out.println(result2);
		double result3=divideNumbers(num1,num2);
		System.out.println(result3);
		scan.close();
	}
		public static int subtractNumbers(int num1,int num2)
		{
			return num1+num2;
		}
		public static int addNumbers(int num1,int num2)
		{
			return num1-num2;
		}
		public static int multiplyNumbers(int num1,int num2)
		{
			return num1*num2;
		}
		public static int divideNumbers(int num1,int num2)
		{
			return num1/num2;
		}
		

	}


