package joptionpane;
import javax.swing.*;
public class joptionpane {
    public static void main(String args[]) {
		double n1, n2, resp = 0;
		String jo = "";

		jo = JOptionPane.showInputDialog(null, "Coloque o número ");
		n1 = Double.parseDouble(jo);

		jo = JOptionPane.showInputDialog(null, "Coloque o número ");

		n2 = Double.parseDouble(jo);

		resp = n1*n2;

		JOptionPane.showMessageDialog(null, "A multiplicação: "+resp);
	}
}
