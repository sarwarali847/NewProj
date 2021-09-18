package project;
import java.util.*;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b,e;
		double res;
		System.out.println("Enter base value:");
		b=sc.nextInt();
		System.out.println("Enter exponential value:");
		e=sc.nextInt();
		res=square(b,e);
		System.out.println(b+"^"+e+"="+res);
		}
	public static double square(int a, int b)
	{
		double c;
		c=Math.pow(a, b);
		return c;
	}

}
