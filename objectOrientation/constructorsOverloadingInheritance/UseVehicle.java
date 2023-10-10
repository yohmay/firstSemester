package objectOrientation.constructorsOverloadingInheritance;

import javax.swing.JOptionPane;

public class UseVehicle {
    public static void main(String args[]) {
        Vehicle v = new Vehicle();
        v.connected();
        v.setName(JOptionPane.showInputDialog("Digite o nome:"));
        v.setVelocity(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade:")));

        JOptionPane.showMessageDialog(null, "Velocidade Atual: " + v.getvelocity());
        v.accelerate();

        JOptionPane.showMessageDialog(null, "Velocidade Atual: " + v.getvelocity());
        v.brake();

        JOptionPane.showMessageDialog(null, "Velocidade Atual: " + v.getvelocity());
        v.desconnected();
    }
}