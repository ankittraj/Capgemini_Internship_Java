package Oct_27;

import java.util.ArrayList;
import java.util.List;

class RentalShop {
    private List<Vehicle> fleet;
    private List<Rental> rentals;

    public RentalShop() {
        fleet = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rent(String vehicleId, Customer customer, int days) {
        if (days <= 0) {
            throw new IllegalArgumentException(
                "Rental days must be greater than zero"
            );
        }

        Vehicle selectedVehicle = null;

        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equals(vehicleId)) {
                selectedVehicle = vehicle;
                break;
            }
        }

        if (selectedVehicle == null) {
            throw new IllegalArgumentException(
                "Vehicle not found: " + vehicleId
            );
        }

        if (!selectedVehicle.isAvailable()) {
            throw new IllegalStateException(
                selectedVehicle + " is already rented"
            );
        }

        selectedVehicle.setAvailable(false);

        Rental rental = new Rental(selectedVehicle, customer, days);
        rentals.add(rental);
        customer.addRental(rental);

        System.out.printf(
            "%s rented %s for %d days = %.2f%n",
            customer.getName(),
            selectedVehicle,
            days,
            rental.getTotalRent()
        );
    }

    public void giveBack(String vehicleId) {
        for (Rental rental : rentals) {
            Vehicle vehicle = rental.getVehicle();

            if (vehicle.getId().equals(vehicleId)
                    && !vehicle.isAvailable()) {
                vehicle.setAvailable(true);
                System.out.println(vehicle + " returned successfully");
                return;
            }
        }

        System.out.println("No active rental found for: " + vehicleId);
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle);
            }
        }
    }
}
