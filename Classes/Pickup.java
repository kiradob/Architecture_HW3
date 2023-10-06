package Architecture_HW3.Classes;

import Architecture_HW3.Enumerators.TypeCar;
import Architecture_HW3.Enumerators.TypeFuel;
import Architecture_HW3.Enumerators.TypeGearBox;
import Architecture_HW3.Interfaces.ICarWash;
import Architecture_HW3.Interfaces.IFuelStation;

import java.awt.*;

public class Pickup extends Car implements IFuelStation, ICarWash {
    

    private int loadCap;

    public Pickup(String make, String model,  
                int numberWheels, TypeFuel fuelType, TypeGearBox gearBoxType, 
                Color bodyColor, int engineCap, int loadCap) {
            
                    super (make, model, TypeCar.PICKUP, numberWheels, fuelType, gearBoxType, bodyColor, engineCap);
                        this.loadCap=loadCap;
                }
                @Override
                public void fuel() {

                }
                @Override
                public void wipWindshield() {

                }
                @Override
                public void wipHeadlights() {
        
                }
                @Override
                public void wipMirrors() {
        
    }
}
