// Constructor Parameters

package objectOrientation.constructorsOverloadingInheritance;

import objectOrientation.objectOrientedIntroduction.Vehicle;

public class ConstructorParameters {

    // private String code;
    private String name;
    private String brand;

    void Vehicle(String n) {
        name = n;
        brand = "Valor Padrão";
    }

    public void ViewInformation() {
        System.out.println("Nome: " + name);
        System.out.println("Marca: " + brand);
    }
}

class UseVehicle {
    public static void main(String args[]) {
        Vehicle c1 = new Vehicle("Fiesta");
        Vehicle c2 = new Vehicle("Ecosport");
        c1.ViewInformation();
        c2.ViewInformation();
    }

}
