class Vehicle {

    String ownerName;
    String vehicleType;

    static double registrationFee = 1000;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Jeet", "Car");
        Vehicle v2 = new Vehicle("Jay", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}