package programming_project_3_13;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount paavosAccount = new BankAccount();
//test 1
        paavosAccount.deposit(500);
        paavosAccount.withdraw(50);

        paavosAccount.deductMonthlyFee();
        System.out.println("Paavos Accounts Balance is: "+paavosAccount.getBalance());

        //Month 1
        BankAccount account1 = new BankAccount();

        account1.deposit(500);
        account1.withdraw(25);
        account1.deposit(25);
        account1.deposit(250);
        account1.deposit(750);
        account1.withdraw(500);

        account1.deductMonthlyFee();
        System.out.println("Account 1's Month 1 balance is: "+account1.getBalance());

        //Month 2
        account1.deposit(500);
        account1.deposit(500);
        account1.deposit(250);
        account1.withdraw(250);

        account1.deductMonthlyFee();
        System.out.println("Account 1's Month 2 balance is: "+account1.getBalance());

    }
}
