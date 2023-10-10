// Abstract Class

package objectOrientation.constructorsOverloadingInheritance;

public abstract class AbstractClass {

    // Attributes
    private float velocity;
    private int passenger;

    // Builders
    public void Vehicle(float v, int p) {
        velocity = v;
        passenger = p;
    }

    public void Vehicle() {
    }

    // Access Methods
    public void setVelocity(float v) {
        velocity = v;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setPassenger(int p) {
        passenger = p;
    }

    public int getPassenger() {
        return passenger;
    }

    // Abstract Methods
    public abstract void accelerate();

    public abstract void brake();
}