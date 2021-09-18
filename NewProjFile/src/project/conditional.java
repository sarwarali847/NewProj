package project;
import java.util.Scanner;
public class conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter your age:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    int age=Integer.parseInt(str);
		if(age>=18)
		{
			System.out.println("You are 18+.");
			if(age>20)
			{
				System.out.println("You can ride.");
			}
				else {
					System.out.println("You cannot ride.");
			}
		}
		else if(age<18)
			System.out.println("18-");

	}

}
