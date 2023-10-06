/* Do While Repetition Structure */
package objectOrientation.objects;

public class DoWhileStructure {

    private int number;

    public void setPairNumbers(int vNumber) {
        number = vNumber;
    }

    public int getPairNumbers() {
        return number;
    }

    public int getPairNumbers(int vNumber) {
        int accountant = 1;
        int pairNumbers = 0;

        do {
            if (accountant % 2 == 0)
                pairNumbers++;
            accountant++;
        } while (accountant <= vNumber);

        return pairNumbers;
    }
}
