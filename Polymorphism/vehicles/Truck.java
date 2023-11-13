package polimorphism.vehicles;

public class Truck extends VehicleImp {
    private static final double SUMMER_FUEL_CONSUMPTION = 1.6;
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + SUMMER_FUEL_CONSUMPTION);
    }

     @Override
    public String drive(double distance) {
        return super.drive(distance);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }
}
