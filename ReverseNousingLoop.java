import java.util.Scanner;
class ReverseNousingLoop 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int rev=0;
		int num= Sc.nextInt();
		while(num>0)
		{
			int rem=num%10;
			
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println("Reverse No ="+rev);
	}
}
