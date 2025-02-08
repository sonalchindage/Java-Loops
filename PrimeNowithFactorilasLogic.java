import java.util.Scanner;
class PrimeNowithFactorilasLogic 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the num");
		int num = Sc.nextInt();
		int cnt=0;
		for(int i =2; i<num; i++)
		{
			if(num%i==0)
			{
				System.out.println(i+" ");
				cnt++;
				
			}
			
		}
		System.out.println("cnt:"+cnt);
		if(cnt==0) System.out.println("Given no is  a prime");
		else System.out.println("Given no not is prime");
	}
}
