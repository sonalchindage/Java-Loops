import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the Nimber=");
		int num= Sc.nextInt();
		
		for(int i = 1 ; i<=10 ;i++)
		{
			System.out.println(i +"X"+num+ "=" +(num*i));
		}
	}
}
