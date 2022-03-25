public class SpecialCheckingAccount extends CheckingAccount{
    private double minAmt;
    private double annInt;

    public SpecialCheckingAccount(int id, double startBal, double cc, double iRate, double min) {
        super(id, startBal, cc);
        annInt = iRate;
        minAmt = min;
    }
    public void clearCheck(double amt) {
        if (currentBalance() < minAmt) {
            super.clearCheck(amt);
        }
        else decreaseBalance(amt);
    }
    public double monthlyInterest() {
        if (currentBalance() > minAmt) {
            return currentBalance() * annInt / 12;
        } else {
            return super.monthlyInterest();
        }
    }
}
