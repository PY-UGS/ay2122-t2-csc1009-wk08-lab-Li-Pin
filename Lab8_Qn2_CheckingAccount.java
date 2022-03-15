public class Lab8_Qn2_CheckingAccount {
    private double balance;
    private double number;

    public Lab8_Qn2_CheckingAccount(double balance , double number) {
        this.balance = balance;
        this.number = number;
    }

    public double deposit(double amt) throws Exception{
        //check if input is negative
        if (amt <= 0){
            throw new Exception("Sorry, please deposit a positive value\n");
        }
        else{
            balance += amt;
            return balance;
        }
        
    }

    public double withdraw(double amt) throws Lab8_Qn2_InsufficientFundsException, Exception{
        //check if input is more than balance
        if (balance < amt){
            throw new Lab8_Qn2_InsufficientFundsException(amt);
        }
        //check if input is negative
        else if (amt <= 0){
            throw new Exception("Sorry, please deposit a positive value\n");
        }
        else { 
            balance -= amt;
            return balance;
        }
        
    }

    public double getBalance() {
        return balance;
    }

    public double getNumber() {
        return number;
    }

    
}
