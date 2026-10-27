package Oct_27;

// Problem 2: Vehicle rental shop

// Build a rental shop for different kinds of vehicles.
// Create an interface Rentable with calculateRent(int days) and isAvailable().
// Create an abstract class Vehicle that implements it. Each vehicle has an id, model, daily rate and availability.
// Car costs rate × days.
// Bike costs rate × days, with a 10% discount for 7 or more days.
// Truck costs rate × days plus a fixed 500 insurance charge.
// A Customer keeps a history of their Rental objects. A Rental links a vehicle, a customer and a number of days.
// RentalShop stores the fleet. It supports rent(), which throws an exception if the vehicle is missing or already rented, as well as giveBack() and showAvailable().

// Expected OutPut:
// Asha rented Bike Activa (B1) for 8 days = 2880.00
// Ravi rented Truck Tata Ace (T1) for 2 days = 5500.00
// Error: Bike Activa (B1) is already rented
// Available vehicles:
//   Car Swift (C1)
//   Bike Activa (B1)

public class RentalDemo {
    public static void main(String[] args) {
        RentalShop shop = new RentalShop();

        Vehicle car = new Car("C1", "Swift", 1500);
        Vehicle bike = new Bike("B1", "Activa", 400);
        Vehicle truck = new Truck("T1", "Tata Ace", 2500);

        shop.addVehicle(car);
        shop.addVehicle(bike);
        shop.addVehicle(truck);

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        shop.rent("B1", asha, 8);
        shop.rent("T1", ravi, 2);

        try {
            shop.rent("B1", ravi, 3);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        shop.showAvailable();
    }
}