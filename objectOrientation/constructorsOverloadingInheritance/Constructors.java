// Constructors

package objectOrientation.constructorsOverloadingInheritance;

import objectOrientation.objectOrientedIntroduction.Vehicle;

public class Constructors {

    // private String code;
    // private String name;
    private String brand;

    void Vehicle() {
        brand = "Standard value";
    }

    public void ShowBrand() {
        System.out.println("Brand: " + brand);
    }
}

class UseVehicle {
    public static void main(String args[]) {
        Vehicle c1 = new Vehicle(null);
        c1.ShowBrand();
    }
}
