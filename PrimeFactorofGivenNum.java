import java.util.Scanner;
class PrimeFactorofGivenNum 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter a number=");
		int num = Sc.nextInt();
		int fact=0;
		
		for(int i =1; i<= num; i++)
		{
			if(num%i==0)
			{
				fact =i;
				//System.out.print(" "+fact);
				System.out.println();
				 if((fact%2 !=0) ||(fact==2)) System.out.println("fact is  prime"+fact);
				 else System.out.println("fact is not prime "+fact);
				
			}
		}
		
	}
}
