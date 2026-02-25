package ProblemsNoNumbers;
// Write a program to check weather the given number is palindrome number or not.
import java.util.Scanner;
public class palindrome {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int temp=num;
		int reverse=0;
		while(num!=0)
		{
		 int reminder=num%10;
		    reverse=reverse*10+reminder;  
		    num=num/10;
		    
		}
		if(temp==reverse)
		
			System.out.println("Its a palindrome number");
		else
			System.out.println("Its not palindrome number");
	}

}
