package ProblemsNoNumbers;
import java.util.Scanner;
public class fibonacciSeries {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter A Range");
	    int range=sc.nextInt();
	    int a=0;
	    int b=1;
	   for(int i=1;i<=range;i++)
	   {
		   System.out.println(a);
		   int c=a+b;
		   a=b;
		   b=c;
	   }
	 
	}

}
