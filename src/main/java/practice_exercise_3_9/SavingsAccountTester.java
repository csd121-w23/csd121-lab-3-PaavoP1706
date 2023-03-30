package practice_exercise_3_9;

public class SavingsAccountTester {

    public static void main(String[] args) {

        SavingsAccount paavosAccount = new SavingsAccount();

        paavosAccount.deposit(1000);

        paavosAccount.addInterest(paavosAccount.getInterest());
        System.out.println("Actual Value: " + paavosAccount.getBalance());

        System.out.println("Expected Value: 1100");
    }

    
}
