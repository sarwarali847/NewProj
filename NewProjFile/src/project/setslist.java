package project;
import java.util.*;

public class setslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Set<Integer> a=new HashSet<Integer>();
		int i;
	    a.add(5);
	    a.add(6);
	    a.add(5);
	    a.add(9);
	    boolean x=a.contains(9);
	    System.out.println(x);

	}

}
