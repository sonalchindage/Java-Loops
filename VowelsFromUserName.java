import java.util.Scanner;
class VowelsFromUserName 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter Your name:");
		String st = Sc.next().toUpperCase();
		
		for(int i =0; i<st.length();i++)
		{
			if(st.charAt(i)=='A'|| st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U')
			{
				System.out.println(st.charAt(i));
			}
		}
	}
}
