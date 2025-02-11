import java.util.Scanner;
class Sample 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the Star no=");
		int num = Sc.nextInt();
		int sum=0;
		for(int i =1; i<=num;i++)
		{
			sum+=i;
			System.out.print(sum+" ");
		}
		
		
	}
}
