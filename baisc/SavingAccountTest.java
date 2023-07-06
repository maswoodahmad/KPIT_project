package baisc;

public class SavingAccountTest {
    public static void main(String[] args) {
        System.out.println("Hello STS!");
        SavingAccount s1= new SavingAccount();
        s1.setDetails("maswood", 100, 4500.5);
        s1.showDetails();

    }
}