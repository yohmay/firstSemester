package exercises;

public class TestQ3 {
    public TestQ3() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            switch (i) {
                case 0:
                    System.out.print("v");
                    break;
                case 1:
                    System.out.print("w");
                case 2:
                    System.out.print("x");
                    break;
                case 3:
                    System.out.print("y");
                case 4:
                    System.out.print("z");
                    break;
                default:
                    System.out.print("d");
            }
        }
    }
}
