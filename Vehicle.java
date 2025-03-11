class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000; // Common for all vehicles

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method: Display Vehicle Details
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: Rs." + registrationFee);
    }

    // Class Method: Update Registration Fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Madhav", "Car");
        Vehicle v2 = new Vehicle("Simran", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Updating the registration fee
        Vehicle.updateRegistrationFee(6000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
