// While Repetition Structure

package objectOrientation.structures;

public class WhileStructure {
    private int number;

    public void setPairNumbers(int vNumber) {
        number = vNumber;
    }

    public int getPairNumbers() {
        return number;
    }

    public int retPairNumbers(int vNumber) {
        int accountant = 1;
        int pairNumbers = 0;

        while (accountant <= vNumber) {
            if (accountant % 2 == 0)
                pairNumbers++;
            accountant++;
        }
        return pairNumbers;
    }
}
