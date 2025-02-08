import java.util.Scanner;
class SumOfFactorsOfaNum 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = Sc. nextInt();
		int sum =0;
		for(int i =1; i<= num; i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				sum+=i;
			}
				
		}
		System.out.println("Sum="+sum);
	}
}
