import java.util.Scanner;

public class Lab8_Qn2_BankDemoTest {
    public static void main (String[] args) throws Lab8_Qn2_InsufficientFundsException{
        Lab8_Qn2_CheckingAccount acc1 = new Lab8_Qn2_CheckingAccount(0, 987654321);

        Scanner input = new Scanner(System.in);

        //If user input is negative, keep prompting user
        while(true){
            try{
                System.out.println("Enter an amount to deposit: ");
                double deposit = input.nextDouble();
                double afterDepositBal = acc1.deposit(deposit);
                System.out.println("Deposit successful. Current balance: $" + afterDepositBal);
                break;
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
        //If user input is negative or more than balance, keep prompting user
        while(true){
            try{
                System.out.println("\nEnter an amount to withdraw: ");
                double withdraw = input.nextDouble();
                double afterWithdrawBal = acc1.withdraw(withdraw);
                System.out.println("The balance after withdraw is: $" + afterWithdrawBal);
                break;
            } catch(Lab8_Qn2_InsufficientFundsException e){
                double balance = acc1.getBalance();
                System.out.println("Sorry, but your account is short by: $" + (e.getAmount() - balance));
            } catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }

        input.close();
    }
}
