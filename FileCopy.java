import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        try {
            File inputFile = new File("file1.txt");
            File outputFile = new File("file2.txt");

            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            in.close();
            out.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}
