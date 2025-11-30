class RoadVehicle implements ImportDuty {
    protected String registrationNumber;
    protected String make;
    protected String model;
    protected int year;
    protected double value;
    
    public RoadVehicle(String registrationNumber, String make, String model, int year, double value) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.value = value;
    }
    
    @Override
    public double calculateDuty() {
        // Default implementation - returns 0 for generic vehicles
        return 0.0;
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getValue() {
        return value;
    }
    
    public void displayInfo() {
        System.out.println("Registration: " + registrationNumber);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Value: $" + String.format("%.2f", value));
    }
}
