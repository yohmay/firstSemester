/*For Repetition Structure */
package objectOrientation.objects;

public class ForStructure {

    private int number;

    public void setPairNumbers(int vNumber) {
        number = vNumber;
    }

    public int getPairNumbers() {
        return number;
    }

    public int getPairNumbers(int vNumber){
        int accountant = 1;
        int pairNumbers = 0;

        for (int accountant + 1; accountant <= vNumber; accountant++){
            
            if(accountant % 2 == 0){
                pairNumbers++;}
        }
        return pairNumbers;
    }
}
