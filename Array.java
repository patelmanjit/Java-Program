import java.util.*;
public class Array
{ 
    Scanner sc = new Scanner(System.in);
    private int data[]=new int [10];
    private int n;
    public Array()
    {
      //data= new int[10];
      System.out.println("Worked");
    }
    public Array(int size)
    {
        n=size;  
        System.out.println("Worked");
    }
    public Array(int array[],int size)
    {
        System.out.println("Worked");
        n=size;
        for(int i=0;i<n;i++)
        {
           data[i]=0;
        }
        for(int i=0;i<n;i++)
        {
           data[i]=array[i];
        }
    }
    public void reverse_an_array(int data[],int len)
    {
        for(int i=len-1;i>=0;i--)
        {
            System.out.print(" " +data[i]);
        }
        
    }
    
    public static void main(String[] args) 
    {
        int n;
        int array[]=new int[100]; 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sze of the array");
        n=s.nextInt();
        Arraya=new Array();
        Arrayb=new ArrArray(n); 
        System.out.print("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
           array[i]=s.nextInt();
        } 
        Array c=new Array(array,n);
        Array d=new Array();
        d.reverse_an_array(array,n);
    }
}