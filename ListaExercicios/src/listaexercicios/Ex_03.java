package listaexercicios;

import javax.swing.*;

public class Ex_03 {

    public static void main(String[] args) {
        double perimetro, raio, pi = 3.14159265;
        String a;

        a = JOptionPane.showInputDialog(null, "Digite o valor do raio:");
        raio = Double.parseDouble(a);

        perimetro = 2 * pi * raio;

        JOptionPane.showMessageDialog(null, "O perimetro é igual a: " + perimetro);

    }

}
