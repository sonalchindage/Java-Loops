import java.util.Scanner;
class EmirpNo 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the num");
		int num = Sc.nextInt();
		int dup =num;
		
		int digi=0;
		int cnt=0;
		for(int i =2; i<num;i++)
		{
			if(num%i==0)
			{
			  System.out.println("Num is not Prime");
			  break;
			}	
			
		}
		System.out.println("Num is prime");
				cnt++;
				while(num>0)
				{
					int rem = num%10;
					digi=digi*10+rem;
					num/=10;
				}
				System.out.println("Reverse no= "+digi);
		for(int i =2; i<digi;i++)
		{
		     if(digi%i==0) 
			{
				System.out.println("Reverse is not prime=");
				break;
			}
			else
			{
				System.out.println("Reverse is prime");
				cnt++;
				break;
			}
		}
		if(cnt==2) System.out.println("No is Emirp");
		else System.out.println("No is not Emirp");
		
	}
}
