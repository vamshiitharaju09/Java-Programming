package ProblemsNoNumbers;
// prime numbers in a given range 

import java.util.Scanner;
public class primeInRange {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range");
		int range=sc.nextInt();
		for(int i=2;i<=range;i++)
		{    
			
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i +",");
			} 
		}
		
	}

}

