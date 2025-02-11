import java.util.Scanner;
class TemperatureConversion 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the Temerature in degree");
		float t1=Sc.nextFloat();
		
		System.out.println("1. farenheight");
		System.out.println("2. Kelvin");
		System.out.println("3. rankine");
		
		int inp=Sc.nextInt();
		double t2=0;
		if(inp==1)
		{
			
			t2=(t1*(9/5))+32;
				System.out.println("Conversion from deegre celcius to farenheight="+t2);
		
		}
		else if(inp == 2)
		{
			t2=t1+273.15;
			System.out.println("Conversion from deegre celcius to Kelvin"+t2);
		}
		else if (inp==3)
		{
			t2=((t1+273.15)*(9/5));
			System.out.println("Conversion from deegre celcius to Rankine"+t2);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
