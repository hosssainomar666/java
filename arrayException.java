import java.util.*;

public class arrayException {
    public static void main(String[] args) {
        int a[] = new int[50];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(50);
        }

        try {
            System.out.println(a[52]); // Index 52 is out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
        }
    }
}
