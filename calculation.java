import java.util.Scanner;

class EnteredValueIsZero extends Exception{}

class EnteredValueIsNegativeOrNonInteger extends Exception{}

public class calculation{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of your array: ");

       try {
           for (int i = 0; i < n; i++) {
               arr[i] = s.nextInt();
               if (arr[i] == 0) {
                   throw new EnteredValueIsZero();
               }

               if (arr[i] < 0 || !s.hasNextInt()) {
                   throw new EnteredValueIsNegativeOrNonInteger();
               }

           }
       }

       catch (Exception e) {
           System.out.println(e);
       }
    }
}
