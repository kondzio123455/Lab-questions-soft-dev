class CD extends LibraryItem implements LoanItem {
    private String band;
    private String title;
    private int numTracks;
    
    public CD(String ID, String band, String title, int numTracks) {
        super("CD", ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }
    
    // Q1e) calculatePrice implementation for CD
    @Override
    public double calculatePrice() {
        // Price based on number of tracks: $0.50 per track
        return numTracks * 0.50;
    }
    
    public String getBand() {
        return band;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getNumTracks() {
        return numTracks;
    }
}

