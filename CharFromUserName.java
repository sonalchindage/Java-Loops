import java.util.Scanner;
class CharFromUserName 
{
	public static void main(String[] args) 
		throws InterruptedException
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the Name=");
		String st= Sc.next().toUpperCase();
		
		for(int i =0; i<st.length();i++)
		{
			System.out.println(st.charAt(i));
			Thread.sleep(1000);
		}
		
	}
}
