import java.util.Scanner;
class PinCheckingPro 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner Sc= new Scanner(System.in);
		int storePin=143;
		int Sec=5000;
		
		OuterLoop:
			for(; ;)
		{
			int atttemps=3;
			
			do{
				System.out.println("Enter your Pin:");
				int pin = Sc.nextInt();
				
				if(storePin==pin)
				{
					System.out.println("Phone Unlocked");
					break OuterLoop;
				}
				else
				{
					System.out.println("Wrong Pin");
				}
				atttemps--;
			} while(atttemps>=1);
				
			System.out.println();
			System.out.println("phone is disabled for "+(Sec/1000)+" Seconds");
			Thread.sleep(Sec);
			Sec*=2;
			System.out.println();
		}
	}
}
