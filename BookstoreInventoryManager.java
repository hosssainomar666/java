import java.util.ArrayList;
import java.util.Collections;
public class BookstoreInventoryManager {
 public static void main(String[] args) {
 // a) Define an ArrayList named bookInventory
 ArrayList<String> bookInventory = new ArrayList<>();
 // Initialize it with five initial book titles
 bookInventory.add("Java Programming");
 bookInventory.add("Data Structures and Algorithms");
 bookInventory.add("Web Development Basics");
 bookInventory.add("Java Fundamentals");
 bookInventory.add("Database Design");
 // Display the initial book inventory
 System.out.println("Initial Book Inventory:");
 displayInventory(bookInventory);
 // b) Add two more book titles to the existing bookInventory
 bookInventory.add("Mobile App Development");
 bookInventory.add("Artificial Intelligence");
 // Display the updated book inventory
 System.out.println("\nBook Inventory After Adding Two Titles:");
 displayInventory(bookInventory);
 // c) Remove the book titled "Java Fundamentals" from the bookInventory
 bookInventory.remove("Java Fundamentals");
 // Display the book inventory after removal
 System.out.println("\nBook Inventory After Removing 'Java Fundamentals':");
 displayInventory(bookInventory);
 // d) Display the total number of books currently present in the bookInventory
 System.out.println("\nTotal Number of Books in Inventory: " + bookInventory.size());
 // e) Display all the book titles in the bookInventory in alphabetical order
 Collections.sort(bookInventory);
 System.out.println("\nBook Inventory in Alphabetical Order:");
 displayInventory(bookInventory);
 // f) Clear all the book titles from the bookInventory at once
 bookInventory.clear();
 // Display the book inventory after clearing
 System.out.println("\nBook Inventory After Clearing:");
 displayInventory(bookInventory);
 }
 // Utility method to display the book inventory
 private static void displayInventory(ArrayList<String> inventory) {
 for (String title : inventory) {
 System.out.println(title);
 }
 }
}