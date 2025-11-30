class HGV extends RoadVehicle {
    private double loadCapacity;
    private int numAxles;
    
    public HGV(String registrationNumber, String make, String model, int year, double value,
               double loadCapacity, int numAxles) {
        super(registrationNumber, make, model, year, value);
        this.loadCapacity = loadCapacity;
        this.numAxles = numAxles;
    }
    
    @Override
    public double calculateDuty() {
        // Use HGVTAXRATE from ImportDuty interface
        return value * HGVTAXRATE;
    }
    
    public double getLoadCapacity() {
        return loadCapacity;
    }
    
    public int getNumAxles() {
        return numAxles;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=== HGV DETAILS ===");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tonnes");
        System.out.println("Number of Axles: " + numAxles);
        System.out.println("Tax Rate: " + (HGVTAXRATE * 100) + "%");
        System.out.println("Import Duty: $" + String.format("%.2f", calculateDuty()));
    }
}
