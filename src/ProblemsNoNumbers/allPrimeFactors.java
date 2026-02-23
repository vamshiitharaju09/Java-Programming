package ProblemsNoNumbers;
import java.util.Scanner;
public class allPrimeFactors {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to  get prime factors");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			while(num%i==0)
			{
				
				System.out.println(i);
				num=num/i;
			}
		}
	}
}
