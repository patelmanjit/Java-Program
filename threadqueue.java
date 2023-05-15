import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

class queue{
    producer p = new producer();
    static PriorityQueue<Integer> queue = new PriorityQueue<Integer>(15);

     static void gettingArray(int ...arr){
         int count=0;
         System.out.println("Adding Elements into Queue: ");
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            count++;
        }
         System.out.println(queue);
        if (queue.isEmpty()){
            isEmpty = true;
        }
        if (count==15){
            isFull = true;
        }
    }
    static boolean isFull,isEmpty;

}
class producer implements Runnable{
    public void run(){
        produce();
    }
    public void produce() {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers you want to generate [MAX = 15]: ");
        int isize = s.nextInt();
        int[] arr = new int[isize];
        System.out.println("Generating Random Numbers: ");
        for (int i = 0; i < isize; i++) {
            arr[i] = random.nextInt(50);
            System.out.println(arr[i]);
        }
        queue.gettingArray(arr);
    }
}

class consumer implements Runnable{
    public void run(){
        consume();
    }
    public void consume(){
        System.out.println("Enter the number of elements you want to consume: ");
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        for (int i = 0; i < c; i++) {
            queue.queue.poll();
        }
        System.out.println("Queue after consuming elements: ");
        System.out.println(queue.queue);
    }
}
public class threadqueue{
    public static void main(String[] args) throws InterruptedException {

        producer pro = new producer();
        consumer con1 = new consumer();
        consumer con2 = new consumer();
        queue q = new queue();
        Thread p = new Thread(pro);
        Thread c1 = new Thread(con1);
        Thread c2 = new Thread(con2);
        p.setPriority(Thread.NORM_PRIORITY+1);
        c1.setPriority(Thread.NORM_PRIORITY-1);
        c2.setPriority(Thread.NORM_PRIORITY-1);

        p.start();
        p.join();
        c1.start();

    }
}
