import java.util.HashSet;
class TourGuide {
 String guideID;
 String name;
 String language;
 public TourGuide(String guideID, String name, String language) {
 this.guideID = guideID;
 this.name = name;
 this.language = language;
 }
}
public class TravelAgency {
 public static void main(String[] args) {
 // a) Create and initialize the tourGuideSet
 HashSet<TourGuide> tourGuideSet = new HashSet<>();
 tourGuideSet.add(new TourGuide("TG101", "John", "English"));
 tourGuideSet.add(new TourGuide("TG102", "Maria", "Spanish"));
 tourGuideSet.add(new TourGuide("TG103", "David", "French"));
 tourGuideSet.add(new TourGuide("TG104", "Anna", "German"));
 tourGuideSet.add(new TourGuide("TG105", "Mike", "Italian"));
 // b) Add three new tour guides
 tourGuideSet.add(new TourGuide("TG106", "Sophie", "Chinese"));
 tourGuideSet.add(new TourGuide("TG107", "Alex", "Japanese"));
 tourGuideSet.add(new TourGuide("TG108", "Carlos", "Portuguese"));
 // c) Remove a tour guide
 TourGuide suspendedGuide = new TourGuide("TG103", "David", "French");
 tourGuideSet.remove(suspendedGuide);
 // d) Display the total count of tour guides
 System.out.println("Total count of tour guides: " + tourGuideSet.size());
 // e) Display details of all tour guides
 System.out.println("Details of tour guides:");
 for (TourGuide guide : tourGuideSet) {
 System.out.println("ID: " + guide.guideID + ", Name: " + guide.name + ", Language: " + 
guide.language);
 }
 // f) Check if a tour guide with ID "TG104" exists and display details
 String targetGuideID = "TG104";
 TourGuide foundGuide = null;
 for (TourGuide guide : tourGuideSet) {
 if (guide.guideID.equals(targetGuideID)) {
 foundGuide = guide;
 break;
 }
 }

 if (foundGuide != null) {
 System.out.println("Tour guide found - ID: " + foundGuide.guideID + ", Name: " + 
foundGuide.name + ", Language: " + foundGuide.language);
 } else {
 System.out.println("Tour guide with ID " + targetGuideID + " not found in the tourGuideSet.");
 }
 // g) Clear all tour guide details
 tourGuideSet.clear();
 System.out.println("Tour guide details cleared. Total count: " + tourGuideSet.size());
 }
}