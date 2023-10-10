// Using this

package objectOrientation.constructorsOverloadingInheritance;

public class ExampleThis {

    class Vehicle {
        // private String code;
        private String name;
        private String brand;

        Vehicle(String name, String brand) {
            this.name = name;
            this.brand = "Valor Padrão";
        }

        public void ShowBrand() {
            System.out.println("Nome: " + name);
            System.out.println("Marca: " + brand);
        }
    }

    class UseVehicle {

        public void main(String args[]) {
            Vehicle c1 = new Vehicle("Fiesta", null);
            Vehicle c2 = new Vehicle("Ecosport", null);
            c1.ShowBrand();
            c2.ShowBrand();
        }
    }
}
