//  Switch Case decision structure

package objectOrientation.structures;

import javax.swing.JOptionPane;

public class SwitchCaseStructure {
    private float value;

    public void setvalue(float varValue) {
        value = varValue;
    }

    public float getValue() {
        return value;
    }

    public void convertCurrency(int operation) {
        switch (operation) {
            case 1:
                JOptionPane.showMessageDialog(null, "Total in Dollars:" + (value / 1.89f));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, " Total in Euros:" + (value / 3.75f));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, " Total in Guaranis:" + (value / 0.20f));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, " Total in Bolivars:" + (value / 0.89f));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option");
        }
    }
}
