import java.util.Scanner;
class factorials 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number=");
		int num = sc.nextInt();
		int count=0;
		for(int i= 1; i<= num; i++)
		{
			if(num%i==0)
			{
				count++;
				System.out.print(" "+i);
			}
		}
		System.out.println();
		System.out.println("Count="+ count);
	}
}
