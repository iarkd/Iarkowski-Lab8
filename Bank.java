// Bank.java
// This is the student, starting version of the <Bank> class used with Lab 08.

public class Bank
{
    private double checkingBal;
    private double savingsBal;
    private String name;

    public Bank()
    {
        name = "...b.l.a.n.k...";
        checkingBal = 0.0;
        savingsBal  = 0.0;
    }

    public Bank(String n)
    {
        name = n;
        checkingBal = 0.0;
        savingsBal  = 0.0;
    }

    public Bank(String m, double b)
    {
        name = m;
        checkingBal = b;
        savingsBal = 0.0;
    }
   
    public Bank(String n, double c, double s)
    {
        name = n;
        checkingBal = c;
        savingsBal  = s;
    }

    public double getChecking()
    {
        return checkingBal;
    }

    public double getSavings()
    {
        return savingsBal;
    }

    public double getCombined()
    {
        return checkingBal + savingsBal;
    }

    public void checkingDeposit(double amount)
    {
        checkingBal += amount;
    }

    public void savingsDeposit(double amount)
    {
        savingsBal += amount;
    }
    
    public void checkingWithdrawal(double amount)
    {
        if (amount > checkingBal){
            System.out.println("Insufficient funds. Withdrawal refused.");
        }
        else{
            checkingBal -= amount;
        }
    }
    
    public void savingsWithdrawal(double amount)
    {
        if (amount > savingsBal){
            System.out.println("Insufficient funds. Withdrawal refused.");
        }
        else{
            savingsBal -= amount;
            }
    }
    
    public void transferToChecking(double amount)
    {
        if(amount > savingsBal){
            System.out.println("Insufficient funds. Transfer refused.");
        }
        
        else{
        savingsBal -= amount;
        checkingBal += amount;
       }
    }
    
    public void transferToSavings(double amount)
    {
        checkingBal -= amount;
        savingsBal += amount;
    }
    
    public void splitDeposit(double amount, double percent)
    {
        
    }
    
    public void closeChecking()
    {
        checkingBal = 0;
    }

    public void closeSavings()
    {
        savingsBal = 0;
    }

    public void showBalances()
    {
        System.out.println();
        System.out.println("Account balances for " + name);
        System.out.println("Checking: $" + getChecking());
        System.out.println("Savings:  $" + getSavings());
        System.out.println("Combined: $" + getCombined());
        System.out.println();
    }
}
