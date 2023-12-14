/*package JavaBegeiner;*/
import java.util.*;
public class assignment1{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int id;
        Scanner classification = new Scanner(System.in);
        String title;
        Scanner value = new Scanner(System.in);
        double price;
        Scanner type = new Scanner(System.in);
        String description;
        Scanner box = new Scanner(System.in);
        String category;
        
        System.out.print("Enter the id: ");
        id=number.nextInt();
        System.out.println("Id number is: " +id); 
                
        
        System.out.print("Enter the title: ");
        title=classification.nextLine();
        System.out.println("Title is : " +title);
        
        System.out.print("Enter the price: ");
        price=value.nextDouble();
        System.out.println("Price is: " +price);
        
        System.out.print("Enter the description: ");
        description=type.nextLine();
        System.out.println("Description is: " +description);
        
        System.out.print("Enter the category: ");
        category=box.nextLine();
        System.out.println("category is: " +category);
    }
    
}
