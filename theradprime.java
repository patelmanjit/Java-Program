import java.util.Scanner;
class multiThread extends Thread{
 int first,last;
  public void setValues(int first,int last) {
        this.first=first;
        this.last=last;
    }
    public void run(){
        for (int i = first;i<= last;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
 }
    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n);i++){
            if (n%i ==0)
                return false;
        }
        return true;
    }
}
public class threadprime{
public static void main(String[] args) {
        int first,last;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range of numbers for finding the prime numbers");
        System.out.println("Starting: ");
        first = s.nextInt();
        System.out.println("Ending: ");
        last = s.nextInt();
       multiThread m = new multiThread();
        m.setValues(first,last);
        System.out.println("The list of Prime numbers are as follows: ");
        m.start();
}
}
