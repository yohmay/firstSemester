/* Switch Case decision structure */
package objectOrientation.objects;

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
                JOptionPane.showMessageDialog(null, " Total em Dólares:" + (value / 1.89f));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, " Total em Euros:" + (value / 3.75f));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, " Total em Guaranis:" + (value / 0.20f));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, " Total em Bolivares:" + (value / 0.89f));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
