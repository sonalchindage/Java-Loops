import java.util.Scanner;
class FindSquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the num");
		int num= Sc.nextInt();
		boolean flag = false;
		for(int i = 1; i<= num;i++)
		{
			if(i*i==num)
			{
				flag=true;
				System.out.println("Given No is sqaure root");
				
			}
			
			if(i*i>num)
				break;
		}
		if(!flag)
			System.out.println("This is not have perfect sq. root");
	}
}
