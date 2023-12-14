import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("C:\\Users\\Hp\\Desktop\\java\\lc.txt");

        PrintWriter writer = new PrintWriter(System.getProperty("user.home") + "\\lc.txt");

        writer.println("Hai! How r you? Hope the Java exam found to be easy for you! Good Luck.");
        
        // Close the PrintWriter
        writer.close();
        
        System.out.println("Wrote data in file");
    }
}
