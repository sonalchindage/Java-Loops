import java.util.Scanner;
class SumofFactorialsOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.print("Enter a number=");
		int num= Sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int fact=1;
		int rem=num%10;
		for(int i=1; i<=rem;i++)
		{
			
			fact*=i;
			
		}
		sum+=fact;
		num/=10;
		}
		System.out.println("Sum Factorilas of given no="+sum);
	}
}
	