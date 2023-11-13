package polimorphism.vehicles;

import java.text.DecimalFormat;

public class VehicleImp implements Vehicle {
   private double fuelQuantity;
   private final double fuelConsumption;
   private final DecimalFormat dc;

    public VehicleImp(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.dc = new DecimalFormat("#.##");
    }

     @Override
    public String drive(double distance) {
        double neededFuel = this.fuelConsumption * distance;

             if (this.fuelQuantity >= neededFuel){
                 this.fuelQuantity-= neededFuel;
                 return String.format("%s travelled %s km",
                    this.getClass().getSimpleName(), dc.format(distance) );
        }


        return String.format("%s needs refueling", this.getClass().getSimpleName());
    }

    @Override
    public void refuel(double liters) {
    this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(),this.fuelQuantity);
    }
}
