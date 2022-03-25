public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(int id, double startBal, double iRate){
        super(id, startBal);
        interestRate = iRate;
    }
    public void withdraw(double r) {
        if (r < currentBalance()) {
            decreaseBalance(r);
        }
    }
    public double monthlyInterest() {
        return currentBalance()*  interestRate / 12;
    }
}
