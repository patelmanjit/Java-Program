import java.io.*;
public class prac10{
    public static void main(String[] args) throws IOException {
        String line;
        int count = 0;
        
        FileReader file = new FileReader("text.txt");
        BufferedReader br = new BufferedReader(file);
       
        while((line = br.readLine()) != null) 
       {
            String words[] = line.split(" ");
            count = count + words.length;
        }
        System.out.println("Number of words present in given file: " + count);
        br.close();
    }
}
