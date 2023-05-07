import java.util.Scanner;

public class FibonacciSeries
{
	public static int fibo(int x)
	{
	   if(x==0)
		   return 0;
	   else 
	   if(x==1)
		   return 1;
	   else
	
		   return fibo(x-1)+fibo(x-2);

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(fibo(i)+" ");
		}

	}
}
