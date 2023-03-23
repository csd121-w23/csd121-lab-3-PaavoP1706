package practice_exercise_3_9;

public class SavingsAccount {

    private double balance;
    private double interest = 1.10;
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount; // same as balance=balance-amount;
    }
    public double getBalance(){
        return balance;
    }
    public double getInterest(){return interest;}


    public double addInterest(double Interest)
    {
        balance = balance * Interest;
        return balance;

    }
private void cleanup(){

}
}
