import java.util.Scanner;
class FindFactorsOfaNO 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter a Num");
		int num = Sc.nextInt();
		for(int i =1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.println("Factors of a given no="+i+" ");
			}
		}
	}
}
