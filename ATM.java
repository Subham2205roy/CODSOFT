import java.util.Scanner;
public class ATM{

    ATM(){
        System.out.println("Welcome to ABC bank");
    }

    public static final int pin=1234;
    public int  balance=10000;
    public int current=0;
    public int amount;
   
   
    
    public void menu()
    {
        System.out.println("1.Check Bank Balance\n2.Withdraw\n3.Deposit amount\n4.Exit");
         
        System.out.println("Enter a option");
        Scanner sc =new Scanner(System.in);
        int opt=sc.nextInt();

        switch(opt)
        {
            case 1:
                 Acountbalance();
               
            break;
            case 2:
                 System.out.println("Enter the amount");
                 Scanner scc=new Scanner(System.in);
                 amount=scc.nextInt();
                 Withdraw();
                
                 break;
            case 3:
                DepositAmount();
            break;
            case 4:

            break;
            default:
                System.out.println("invalid option");
        }
    }
        public void Acountbalance()
        {
            System.out.println("your currenrt balance is"+  balance);
            menu();
        }
        public void Withdraw()
        {
           if(amount<=balance)
           {
            
            
                      
            current = balance-amount;
            System.out.println(amount+" succesfully debited from your bank account");
            balance=current;
            menu();
            
           }
            else
            {
                
               System.out.println("deposit amount is crossed account balanced");
               menu();

            }

        }
        void DepositAmount()
        {
            System.out.println("your deposit amount is"+current);

        }
        void exit()
        {
            System.out.println("you are going to exit from the system");

             
        }
    
}
    
    
class main{

    public static void main(String[] args)
    {
        ATM obj=new ATM();
        Scanner vh=new Scanner(System.in);
        System.err.println("Enter the pin");
        int pass = vh.nextInt();
        if(pass==obj.pin)
        {
          obj.menu();
        }
        else
        {
            System.err.println("pin is incorrect");
        }
    }

    
}