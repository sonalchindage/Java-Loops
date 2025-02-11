import java.util.Scanner;
class PalindromString 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String st=Sc.next();
		String temp = st;
		
		String rev="";
		for(int i =st.length()-1; i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		System.out.println("Reverse String = "+rev);
			if(rev.equals(temp)) System.out.println("Given String is Palindrome");
			else System.out.println("Given String is not Palindrome");
	}
}
