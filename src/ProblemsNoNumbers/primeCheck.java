package ProblemsNoNumbers;
import  java.util.Scanner;
public class primeCheck {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		
			System.out.println("Its Prime Number");
		
		else
			System.out.println("Its Not Prime Number");
	}
}
