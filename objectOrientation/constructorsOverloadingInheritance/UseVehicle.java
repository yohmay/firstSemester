package objectOrientation.constructorsOverloadingInheritance;

import javax.swing.JOptionPane;

public class UseVehicle {
    public static void main(String args[]) {
        Vehicle v = new Vehicle();
        v.connected();
        v.setName(JOptionPane.showInputDialog("Enter name:"));
        v.setVelocity(Integer.parseInt(JOptionPane.showInputDialog("Enter the speed:")));

        JOptionPane.showMessageDialog(null, "Current Speed:" + v.getVelocity());
        v.accelerate();

        JOptionPane.showMessageDialog(null, "Current Speed:" + v.getVelocity());
        v.brake();

        JOptionPane.showMessageDialog(null, "Current Speed:" + v.getVelocity());
        v.desconnected();
    }
}