package project;
import java.util.*;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] str=new String[3];
		int i;
		for(i=0;i<str.length;i++)
		{
			System.out.println("Input:");
			String input=sc.nextLine();
			str[i]=input;
			
		}
		System.out.println(str[2]);

	}

}
