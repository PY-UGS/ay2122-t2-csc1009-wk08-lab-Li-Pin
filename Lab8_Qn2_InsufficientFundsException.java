public class Lab8_Qn2_InsufficientFundsException extends Exception {
    private double amount;

    public Lab8_Qn2_InsufficientFundsException(double amount){ 
        this.amount = amount; 
    }

    public double getAmount() {
        return amount;
    }

}
