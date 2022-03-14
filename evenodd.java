package basicprogram;
import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		
			Scanner scn=new Scanner(System.in);
			
			int a=scn.nextInt();
			if (a%2==0)
				{
				System.out.println("number is even");
				}
				
			else	
			{
				System.out.println("number is odd");
			}

	}

}
