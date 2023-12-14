import java.io.*;
public class Fileinfo{
    public static void main(String[]args) throws IOException 
    {
     
        File f = new File("C:\\Users\\Hp\\Desktop\\java\\lc.txt");
        if(f.exists())
        {
            System.out.println("File Name : "+ f.getName());
            System.out.println("File Path : "+ f.getAbsolutePath());
             System.out.println("File writable : "+ f.canWrite());   
              System.out.println("File readable : "+ f.canRead());
               System.out.println("File size : "+ f.length());
        }
        else
        {
             System.out.println("File doesn't Exist");
        }
    }
}