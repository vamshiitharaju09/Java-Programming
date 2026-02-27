package ProblemsNoNumbers;
import java.util.Scanner;
// Find all palindrome numbers in a given range 

public class palindromeRange{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a range");
		int range=sc.nextInt();
		for(int i=10;i<=range;i++)
		{
			int num=i;
			int temp=i;
			int reverse=0;
			while(num!=0)
			{
				int reminder=num%10;
				reverse=reverse*10+reminder;
				num=num/10;
				
			}
			if(temp==reverse)
			{
				System.out.println(temp);
			}
		}
	}
}