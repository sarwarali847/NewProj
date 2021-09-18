package project;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[10];
		System.out.println("Enter array value:");
		int i;
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
			
		
		
	}
}