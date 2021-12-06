package ibf2021;

public class FixedDepositAccount extends BankAccount {
    private float interest = 3.0f;
    private int durationInMonths = 6;
    private boolean isInterestChanged = false;
    private boolean isDurationChanged = false;

    
    public FixedDepositAccount(String name){
        super(name);
    }
    @Override
    public void deposit(float amount){ }

    @Override
    public void withdraw(float amount){
        
     }

    public void setInterest (float interest) {
        if (isInterestChanged == true)
        throw new IllegalArgumentException();
        this.interest = interest;

    }
    public void setDurationInMonths(int durationInMonths){
        this.durationInMonths = durationInMonths;
    }
}
