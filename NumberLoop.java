import java.util.Scanner;
class NumberLoop 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the number=");
		int num= Sc.nextInt();
		int sum=0;
		int evenSum=0;
		while(num>0)
		{
			int rem = num%10;
			sum= sum+rem;
			num= num/10;
		}
		System.out.println("Sum="+sum);
		
		while(num>0)
		{
			int rem = num%10;
			
			if(rem%2==0)
			{
				evenSum= evenSum+rem;
			}
			num= num/10;
			
		}
		System.out.println("EvenSum="+evenSum);
	}
}
