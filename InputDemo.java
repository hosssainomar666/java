import java.util.*;
public class InputDemo{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter any number:");
        number =  input.nextInt();
        System.out.println("Number = "+number);
        

        String name;
        System.out.println("Enter your name:");
        name = input.next();
        System.out.println("Welcome "+name);
    }
}