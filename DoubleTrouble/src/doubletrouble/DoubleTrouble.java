package doubletrouble;
import java.util.*;
public class DoubleTrouble {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int result=doubleTrouble(num);
		System.out.println(result);
		scan.close();
	}
	public static  int doubleTrouble(int num)
	{
		return num*2;
	}

}
