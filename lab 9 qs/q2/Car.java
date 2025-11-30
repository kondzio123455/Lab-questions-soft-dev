class Car extends RoadVehicle {
    private int numDoors;
    private String fuelType;
    
    public Car(String registrationNumber, String make, String model, int year, double value, 
               int numDoors, String fuelType) {
        super(registrationNumber, make, model, year, value);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    
    @Override
    public double calculateDuty() {
        // Use CARTAXRATE from ImportDuty interface
        return value * CARTAXRATE;
    }
    
    public int getNumDoors() {
        return numDoors;
    }
    
    public String getFuelType() {
        return fuelType;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("CAR DETAILS");
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Tax Rate: " + (CARTAXRATE * 100) + "%");
        System.out.println("Import Duty: $" + String.format("%.2f", calculateDuty()));
    }
}
