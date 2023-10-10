package objectOrientation.vectors;

import objectOrientation.objectOrientedIntroduction.Vehicle;

public class Example {
    public static void main(String arg[]) {
        Vehicle car[] = new Vehicle[300];

        for (int index = 0; index < 300; index++) {
            car[index] = new Vehicle(null);
        }

        car[0].setVelocity(10);
        car[10].setVelocity(200);
        car[250].setVelocity(150);

        for (int i = 0; i < 300; i++) {
            car[i].setVelocity(0);
        }
    }
}
