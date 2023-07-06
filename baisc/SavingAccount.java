package baisc;

public class SavingAccount {
    private String holderName;
    private int accNumber;
    private double balance;


    void setDetails(String name, int number, double balance )
    {
        System.out.println("Set account details\n-----------");
        holderName=name;
       accNumber= number ;
       this.balance= balance;

    }
    void showDetails()
    {
        System.out.println("Account holder:"+ holderName);
        System.out.println("Account Numner:"+ accNumber);
        System.out.println("Account Balance:"+balance);
        System.out.println("---------------------");

    }
    void widthrwa( double amt)
    {
        balance-=amt;
    }
    void deposit(double amt)
    {
        balance+=amt;
    }
}
