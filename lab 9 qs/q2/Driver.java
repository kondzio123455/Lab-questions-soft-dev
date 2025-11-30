public class Driver {
    public static void main(String[] args) {

        System.out.println("IMPORT DUTY CALCULATION SYSTEM");

        
        // Create array of RoadVehicles
        RoadVehicle[] vehicles = new RoadVehicle[4];
        
        // Create Car objects
        vehicles[0] = new Car("ABC123", "Toyota", "Camry", 2023, 28000.00, 4, "Petrol");
        vehicles[1] = new Car("XYZ789", "Tesla", "Model 3", 2024, 45000.00, 4, "Electric");
        
        // Create HGV objects
        vehicles[2] = new HGV("HGV001", "Volvo", "FH16", 2023, 95000.00, 25.0, 3);
        vehicles[3] = new HGV("HGV002", "Mercedes", "Actros", 2024, 120000.00, 30.0, 4);
        
        // Display all vehicles and their import duties
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
            System.out.println();
        }
        
        // Calculate total import duty
        System.out.println("SUMMARY REPORT");
        
        double totalCarDuty = 0.0;
        double totalHGVDuty = 0.0;
        double totalDuty = 0.0;
        
        for (RoadVehicle vehicle : vehicles) {
            double duty = vehicle.calculateDuty();
            totalDuty += duty;
            
            if (vehicle instanceof Car) {
                totalCarDuty += duty;
                System.out.println("Car " + vehicle.getRegistrationNumber() + 
                                 "  Duty: $" + String.format("%.2f", duty));
            } else if (vehicle instanceof HGV) {
                totalHGVDuty += duty;
                System.out.println("HGV " + vehicle.getRegistrationNumber() + 
                                 " Duty: $" + String.format("%.2f", duty));
            }
        }
        
        System.out.println("Total Car Import Duty: $" + String.format("%.2f", totalCarDuty));
        System.out.println("Total HGV Import Duty: $" + String.format("%.2f", totalHGVDuty));
        System.out.println("TOTAL IMPORT DUTY: $" + String.format("%.2f", totalDuty));
    }
}
