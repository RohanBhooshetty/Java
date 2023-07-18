package Stringjoiner;

public class StringJoiner {
	public static void main(String [] args)
	{
		String str1="hello,";
		String str2="world!";
		String result=StringJoin(str1,str2);
		System.out.println(result);
	}
	public static String StringJoin(String str1,String  str2)
	{
		return str1+str2;
	}
}
