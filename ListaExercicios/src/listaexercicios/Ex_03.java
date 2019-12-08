package listaexercicios;

import javax.swing.*;

public class Ex_03 {

    public static void main(String[] args) {

        String a;
        double perimetro, raio, pi = 3.14159265;
        try {
            a = JOptionPane.showInputDialog(null, "Digite o valor do raio: ");
            raio = Double.parseDouble(a);

            perimetro = 2 * pi * raio;

            JOptionPane.showMessageDialog(null, "O perimetro é igual a: " + perimetro + " cm");
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }

    }

}
