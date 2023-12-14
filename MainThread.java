import java.util.*;

public class MainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);
        
        // Change current thread name
        t.setName("My Thread");
        
        // Print the updated thread name
        System.out.println("Updated Thread Name: " + t.getName());

        for (int n = 10; n > 0; n--) {
            System.out.println(n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted");
            }
        }
    }
}
