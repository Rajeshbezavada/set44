import java.util.*;
import java.lang.*;
import java.io.*;
class Swapusebitwise
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		System.out.println(n1+" "+n2);
		
	}
}
