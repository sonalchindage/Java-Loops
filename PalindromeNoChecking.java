import java.util.Scanner;
class PalindromeNoChecking 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= Sc.nextInt();
		int temp = num;
		int rev=0;
		while(num>0)
		{
			int rem = num%10;
			rev= rev*10+rem;
			num/=10;
		}
		if(rev==temp) System.out.println("Given No is Palindrome");
		else System.out.println("Given no is Not Palindrome");
	}
}
