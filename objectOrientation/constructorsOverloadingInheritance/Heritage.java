// Heritage 

package objectOrientation.constructorsOverloadingInheritance;

public class Heritage {

    private String name;
    private float velocity;

    public void setName(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getvelocity() {
        return velocity;
    }

    public void accelerate() {
        if (velocity <= 10) {
            velocity++;
        }
    }

    public void brake() {
        if (velocity > 0) {
            velocity--;
        }
    }
}

class Vehicle extends Heritage {

    public void connected() {
    }

    public void desconnected() {
    }
}
