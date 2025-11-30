interface LoanItem {
    double calculatePrice();
}

// Q1b) Parent class LibraryItem
class LibraryItem {
    protected String type;
    protected String ID;
    
    public LibraryItem(String type, String ID) {
        this.type = type;
        this.ID = ID;
    }
    
    public String getType() {
        return type;
    }
    
    public String getID() {
        return ID;
    }
}