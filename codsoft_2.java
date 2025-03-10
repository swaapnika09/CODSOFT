import java.util.Scanner;
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }
   public void deposit(double amount){
    if(amount>0){
        balance+=amount;
        System.out.println("Successfully deposited $"+amount);
    }else{
        System.out.println("Invalid deposit amount!");
    }
   }
   public boolean withdraw(double amount){
    if(amount>0&&amount<=balance){
        balance-=amount;
        System.out.println("Successfully withdrew $"+amount);
        return true;
    }else{
        System.out.println("Invalid withdrawal amount or insuffient funds!");
        return false;
    }
   }
}
class ATM {
    private BankAccount account;
    private java.util.Scanner sc;
    public ATM(BankAccount account){
        this.account=account;
        this.sc=new Scanner(System.in);
    }
    public void showMenu(){
        int choice;
        do{
            System.out.println("\n===ATM Menu===");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.withdraw");
            System.out.println("4.Exit");
            System.out.println("choose an option");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                 checkBalance();
                 break;
                case 2:
                 deposit();
                 break;
                case 3:
                 withdraw();
                 break;
                case 4:
                 System.out.println("Exiting ATM.Thankyou!");
                 break;
                default:
                System.out.println("Invalid option! please try again");
            }
        }while(choice!=4);
    }
    private void checkBalance(){
        System.out.println("Your current balance is:$"+account.getBalance());
    }
    private void deposit(){
        System.out.println("Enter deposit amount");
        double amount=sc.nextDouble();
        account.deposit(amount);
    } 
    private void withdraw(){
        System.out.println("Enter withdrawal amount");
        double amount=sc.nextDouble();
        account.withdraw(amount);
    } 
}
public class codsoft_2{
    public static void main(String args[]){
        BankAccount account=new BankAccount(1000.0);
        ATM atm=new ATM(account);
        atm.showMenu();
    }
}
