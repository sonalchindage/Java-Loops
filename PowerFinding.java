import java.util.Scanner;
class  PowerFinding
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the Num");
		int num = Sc.nextInt();
		System.out.println("Enter the Power");
		int pow = Sc.nextInt();
		int opt = 1;
		for(int i =1 ;i<= pow;i++)
		{
			opt=opt*num;
		}
		System.out.println("Power of given no="+opt);
	}
}
