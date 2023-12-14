import java.io.*;
public class CreateFile{
    public static void main(String[]args) throws IOException 
    {
     
        File f = new File("C:\\Users\\Hp\\Desktop");
        if(f.createNewFile())
        {
            System.out.println("File Created");
        }
        else
        {
             System.out.println("File Exist");
        }
     
     
    }

}