import java.util.Scanner;
class NotEnoughMoneyException extends Exception{}
class Bank{
 int balance;
    public Bank(int balance){
        this.balance=balance;
    }
    void deposit(int deposit){
        System.out.println("The available balance is "+balance);
        this.balance += deposit;
    }
    void withdraw(int withdraw) throws ArithmeticException{
        System.out.println("The available balance is "+balance);
        System.out.println("Withdraw Amount: "+withdraw);
        try{
            if (balance < withdraw){
                throw new ArithmeticException();
            }
            this.balance -= withdraw;
            try{
                if(balance < 500){
                    throw new NotEnoughMoneyException();
                }
            }
            catch (Exception e){
                System.out.println("There is not enough money in your account:"+e);
                System.out.println("Minimum requirement of balance is 500.");
            }
        }
        catch (Exception e) {
            System.out.println("There is a error "+e);
        }
    }
}
public class bankdemo {
    public static void main(String[] args) {
    Bank b = new Bank(20000);
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the amount you want to withdraw: ");
    int withdraw = s.nextInt();
    b.withdraw(withdraw);
    }
}
