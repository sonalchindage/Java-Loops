import java.util.Scanner;
class ReverseaString 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String st = Sc.next();
		String rev="";
		for(int i=st.length()-1; i>=0;i--)
		{
			
			rev= rev+st.charAt(i);
			
		}
		System.out.print(rev);
	}
}
