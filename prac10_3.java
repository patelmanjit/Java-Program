import java.io.File;
public class prac10_3 {
    public static void main(String[] args) 
{       
        String maindirpath="D:\\12202040703020";

        File maindir = new File(maindirpath);

        if (maindir.exists() && maindir.isDirectory()) {
            File arr[] = maindir.listFiles();

            System.out.println(
                    "**********************************************");
            System.out.println(
                    "Files from main directory : " + maindir);
            System.out.println(
                    "**********************************************");
            for (File file : arr) {
                System.out.println(file.getName());
            }
        }
    }
}
