import java.util.Scanner;
class SumOfOddEvenNO
{
 public static void main(String[] args)
 {
  Scanner Sc= new Scanner(System.in);
  System.out.println("Enter the number=");
  int evenSum=0;
  int oddSum=0;
  int num= Sc.nextInt();
  while(num>0)
	 {
		int rem= num%10;
		if(rem%2==0)
		 {
			evenSum+=rem;
		 }
		 else
		 {
			oddSum+=rem;
		 }
		 num=num/10;
	 }
	 System.out.println("EvenSum="+evenSum);
	 System.out.println("oddSum="+oddSum);
 }
}