package objectOrientation.constructorsOverloadingInheritance;

public class ExampleVehicles {

    // Attributes
    private float comb;
    private int velocity;
    private int passenger;

    // Constructors
    public ExampleVehicles(float comb, int velocity, int passenger) {
        this.comb = comb;
        this.velocity = velocity;
        this.passenger = passenger;
    }

    // Access Methods
    public void setCombustible(float comb) {
        this.comb = comb;
    }

    public float getCombustible() {
        return comb;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getPassenger() {
        return passenger;
    }

    // Mandatory Methods
    public void accelerate() {
        setVelocity(getVelocity() + 1);
    }

    public void brake() {
        setVelocity(getVelocity() - 1);
    }
}