package ProblemsNoNumbers;
import java.util.Scanner;
public class perfectNumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("Its a perfect number.");
		}
		else
			System.out.print("Its not a perfect number");
	}

}
