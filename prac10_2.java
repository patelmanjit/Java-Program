import java.io.*; 
class prac10_2{ 
  public static void main(String args[]) throws IOException { 
    int i; 
    FileInputStream fin; 
    if(args.length != 1) { 
      System.out.println("Usage: ShowFile filename"); 
      return; 
    } 
      fin = new FileInputStream(args[0]); 
      do { 
        i = fin.read(); 
        if(i != -1) System.out.print((char) i); 
      } while(i != -1);  

      fin.close(); 
  } 
}
