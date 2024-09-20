public class Main {
    public static void main(String[] args) {
       
        Artist artist1 = new Artist("Ali Hassan");

        
        Artwork artwork1 = new Artwork("Programming Fundamentls", 2023, artist1);
        Artwork artwork2 = new Artwork("Java OOP", 2022);

        System.out.println("Original Artwork Details:");
        artwork1.displayInformation();
        artwork2.displayInformation();

        artwork2.setTitle("Java OOP");
        artwork2.setYear(2022);

    
        System.out.println("\nUpdated Artwork Details:");
        artwork2.displayInformation();

       
        Artwork shallowCopy = artwork1.shallowCopy();
        Artwork deepCopy = artwork1.deepCopy();

       
        System.out.println("\nShallow Copy Details:");
        shallowCopy.displayInformation();
        System.out.println("Deep Copy Details:");
        deepCopy.displayInformation();

        artist1 = new Artist("Hammad"); 

       
        System.out.println("\nAfter Modifying Original Artwork's Artist:");
        artwork1.displayInformation();
        shallowCopy.displayInformation(); 
        deepCopy.displayInformation(); 
    }
}
