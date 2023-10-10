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
            setVelocity(getvelocity() + 0.5f);
        }

        private void setVelocity(float f) {
        }

        private float getvelocity() {
            return 0;
        }

        public void brake() {
            setVelocity(getvelocity() - 0.5f);
        }

    }

    public class Ferrari extends Vehicle {

        public Ferrari(float velocity, int passenger, float comb) {
        }

        public Ferrari() {
            this(0f, 0, 0f);
        }

        public void accelerate() {
            setVelocity(getvelocity() + 3.5f);
        }

        private void setVelocity(float f) {
        }

        private float getvelocity() {
            return 0;
        }

        public void brake() {
            setVelocity(getvelocity() - 3.5f);
        }

    }
}
