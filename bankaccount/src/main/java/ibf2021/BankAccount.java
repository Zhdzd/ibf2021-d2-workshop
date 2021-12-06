package ibf2021;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BankAccount 
{
    
private String name; 
private String accountNumber;
private float accountBalance;
private List<String> transactions;
private boolean isClosed;
private String accountCreateDate;
private String accountClosedDate;

public BankAccount(String name, float accountBalance) {
    this.name = name;
    //TODO with account balance
 }

public BankAccount(String name) {
    this.name = name;
    this.accountBalance = 0f ;
    this.accountNumber = Integer.toString((int) Math.random()*100000);
    transactions = new ArrayList<>();

}


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

   

    /**
     * @return String return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return float return the accountBalance
     */
    public float getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * @return List<String> return the transactions
     */
    public List<String> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    /**
     * @return boolean return the isClosed
     */
    public boolean isIsClosed() {
        return isClosed;
    }

    /**
     * @param isClosed the isClosed to set
     */
    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    /**
     * @return String return the accountCreateDate
     */
    public String getAccountCreateDate() {
        return accountCreateDate;
    }

    /**
     * @param accountCreateDate the accountCreateDate to set
     */
    public void setAccountCreateDate(String accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }

    /**
     * @return String return the accountClosedDate
     */
    public String getAccountClosedDate() {
        return accountClosedDate;
    }

    /**
     * @param accountClosedDate the accountClosedDate to set
     */
    public void setAccountClosedDate(String accountClosedDate) {
        this.accountClosedDate = accountClosedDate;
    }

    public void deposit(float amount){
        if (amount < 0) throw new IllegalArgumentException();
        String transactions = "Deposit" + amount + " at"+ Calendar.getInstance().getTimeInMillis();
        transactions.add(transactions);
        this.accountBalance = this.accountBalance +amount;
        }
    public void withdraw{

    }
    

}
