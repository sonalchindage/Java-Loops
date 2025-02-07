import java.util.Scanner;
class Bank
{
    public static void main(String[] args)
    {
        Scanner Sc= new Scanner(System.in);
        String userName1 = null;
        String password1 = null;
        String address = null;
        long contactNo=0;
        double balance=0.0;

        for(; ;)
        {
            System.out.println("------------Welcome------------");
            System.out.println("Qsyder bank");
            System.out.println("1. Exsisting User");
            System.out.println("2. Create Account");
            System.out.println("Enter an Option");
            int opt = Sc.nextInt();

            if(opt==1)
            {
                if(userName1==null)
                {
                    System.out.println("No user created yet");
                    continue;
                }
                System.out.println("Login");

                for(int i=3; i>=1; i--)
                {
                    System.out.println("UserName:");
                    String username = Sc.next();
                    System.out.println("Password:");
                    String password = Sc.next();

                    if(username.equals(userName1) && password.equals(password1))
                    {
                        for(; ;)
                        {
                            System.out.println(" Home Page");
                            System.out.println("1. Deposite");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Mini Statement");
                            System.out.println("5.Logout");
                            
                            System.out.println("Enter an Option");
                            int opt1 = Sc.nextInt();

                            switch (opt1) {
                                case 1:
                                {
                                    System.out.println("Deposite");
                                    System.out.println("Enter an Amount:");
                                    double depositAmt=Sc.nextDouble();
                                    balance+=depositAmt;
                                    System.out.println("Amount Deposited Successfully");
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("Withdraw");
                                    System.out.println("Enter an Amount:");
                                    double withdrawAmt=Sc.nextDouble();

                                    System.out.println("Enter the Pin");
                                    String password3 = Sc.next();
                                    
                                    if(password3.equals(password1))
                                    {
                                        if(withdrawAmt<=balance)
                                        {
                                            balance-=withdrawAmt;
                                            System.out.println("Amount Withdrawn Successfully");
                                        }
                                        else
                                        {
                                            System.out.println("Insufficient Balance");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Wrong Pin");
                                    }
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Check Balance");

                                    for(int j =3; j>=1;j--)
                                    {
                                        System.out.println("Enter the Pin");
                                        String password4 = Sc.next();
                                        if(password4.equals(password1))
                                        {
                                            System.out.println("Account balance:"+balance+"rs");
                                        }
                                        else
                                        {
                                            System.out.println("Wrong pin");
                                            System.out.println("Attempt left:"+(j-1));
                                        }
                                    }
                                    System.out.println("Your Account has been blocked for 24 hr");
                                    System.exit(0);
                                    break;
                                }
                               case 4:
                               {
                                System.out.println("Mini Statement");
                                break;
                               }
                               case 5:
                               {
                                System.out.println("Thank you for visting our app");  
                                System.out.println("Visit again");  
                                System.exit(0);             

                               }

                            }
                        }
                        
                    }
                    else
                    {
                        System.out.println("Invalid Credentilas");
                        System.out.println("Attemp left"+(i-1));
                    }

                }
                System.out.println("Thank you Never Visit again");
                System.exit(0);
            }
            else if(opt==2)
            {
                System.out.println("Account Creation");
                System.out.println("Enter your Username");
                userName1 = Sc.next();
                System.out.println("Enter your Password");
                password1 = Sc.next();
                System.out.println("Enter your Address");
                Sc.nextLine();
                address=Sc.nextLine();
                System.out.println("Enter your Phone Number");
                contactNo = Sc.nextLong();
                System.out.println("Deposite Amount:");
                balance=Sc.nextDouble();
                System.out.println();
                System.out.println("Account Created Successfully");

            }
            else
            {
                System.out.println("Invalid Option");
            }

        }
    }

}