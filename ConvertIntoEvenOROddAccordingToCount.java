import java.util.Scanner;
class ConvertIntoEvenOROddAccordingToCount 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter a number=");
		int num= Sc.nextInt();
		int cnt=0;
		while(num>0)
		{
			int digit=num%10;
			cnt++;
			System.out.println("Digit="+digit);
			num/=10;
		} 
		
		
		System.out.println("count="+cnt);
		if(cnt%2==0)
		{
			System.out.println("count is Even");
			
			while(num>0)
		{
			int digit=num%10;
			if(digit%2==0){
				System.out.println("Digit="+digit);
			}
			else
			{
				digit+=1;
				System.out.println("Digit="+digit);
			}
			
			num/=10;
		} 
		}
		else
		{
			System.out.println("count is Odd");
		}
	}
}
