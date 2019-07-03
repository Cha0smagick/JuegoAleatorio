/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroaleatorio;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class NumeroAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int NumeroAleatorio = (int) (Math.random() * 100);
        System.out.println(NumeroAleatorio);
        String texto = JOptionPane.showInputDialog("digita el numero a adivinar");
        int compara = Integer.parseInt(texto);
        int x = 0;
        while (NumeroAleatorio != compara) {
            JOptionPane.showMessageDialog(null, "oops, no es el numero");
            x++;
            texto = JOptionPane.showInputDialog("digita el numero a adivinar");
            compara = Integer.parseInt(texto);

        }
        if (NumeroAleatorio == compara) {
            JOptionPane.showMessageDialog(null, "Exito en " + x + " Intentos");
        };
    }
}
