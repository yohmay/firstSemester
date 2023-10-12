// Overlay

package objectOrientation.constructorsOverloadingInheritance;

public class Overlay {

    public class Uno extends Vehicle {

        public Uno(float velocity, int passenger, float comb) {
        }

        public Uno() {
            this(0f, 0, 0f);
        }

        public void accelerate() {
            setVelocity(getVelocity() + 0.5f);
        }

        public void setVelocity(float f) {
        }

        public float getVelocity() {
            return 0;
        }

        public void brake() {
            setVelocity(getVelocity() - 0.5f);
        }

    }

    public class Ferrari extends Vehicle {

        public Ferrari(float velocity, int passenger, float comb) {
        }

        public Ferrari() {
            this(0f, 0, 0f);
        }

        public void accelerate() {
            setVelocity(getVelocity() + 3.5f);
        }

        public void setVelocity(float f) {
        }

        public void brake() {
            setVelocity(getVelocity() - 3.5f);
        }

        public float getVelocity() {
            return 0;
        }

    }
}
