// Simple conditional branch 
package objectOrientation.objects;

public class SimpleConditional {

    private double balance = 0;

    // public void setBalance(double vBalance);

    // public double getBalance();

    public void Withdrawal(double vValue) {
        if (vValue > balance)
            System.out.println("Insufficient funds");
        else
            balance = balance - vValue;
    }
}
