// Overload

package objectOrientation.constructorsOverloadingInheritance;

public class Overload {

    public class Operators {
        public void multiply(double d, double e) {
            System.out.println("Multiplicação: " + d * e);
        }
    }

    public class UsaOperadores {
        public void main(String args[]) {
            Operators op = new Operators();
            op.multiply(1.5, 3.85);
        }
    }
}