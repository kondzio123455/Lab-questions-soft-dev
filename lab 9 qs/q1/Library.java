public class Library {
    public static void main(String[] args) {
        // Create array of LibraryItems
        LibraryItem[] items = new LibraryItem[4];
        
        // Create Book objects
        items[0] = new Book("B001", "George Orwell", "1984", 328);
        items[1] = new Book("B002", "Harper Lee", "To Kill a Mockingbird", 281);
        
        // Create CD objects
        items[2] = new CD("C001", "The Beatles", "Abbey Road", 17);
        items[3] = new CD("C002", "Pink Floyd", "The Wall", 26);
        
        // Display items and call calculatePrice on each
        System.out.println("Library Items and Loan Prices:");
        System.out.println("================================\n");
        
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("Type: " + book.getType());
                System.out.println("ID: " + book.getID());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Pages: " + book.getNumPages());
                System.out.println("Loan Price: $" + String.format("%.2f", book.calculatePrice()));
                System.out.println();
            } 
            else if (item instanceof CD) {
                CD cd = (CD) item;
                System.out.println("Type: " + cd.getType());
                System.out.println("ID: " + cd.getID());
                System.out.println("Title: " + cd.getTitle());
                System.out.println("Band: " + cd.getBand());
                System.out.println("Tracks: " + cd.getNumTracks());
                System.out.println("Loan Price: $" + String.format("%.2f", cd.calculatePrice()));
                System.out.println();
            }
        }
    }
}
