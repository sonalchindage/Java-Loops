import java.util.Scanner;
class ProductOfDigitOfSigleNo
{
 public static void main(String[] args)
 {
 Scanner Sc =new Scanner(System.in);
 System.out.println("Enter the Number:");
 int num= Sc.nextInt();
 int product =1;
 while(num > 0)
 {
   int rem= num%10;
   product=product*rem;
   num=num/10;
  }
  System.out.println("The product of given number is="+product);
 }
}