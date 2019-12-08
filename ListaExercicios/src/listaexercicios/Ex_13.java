package listaexercicios;

import javax.swing.*;

public class Ex_13 {

    public static void main(String[] args) {

        String a;
        int ida, mdi = 18, cont = 0;
        try {
            for (int i = 0; i < 20; i++) {

                a = JOptionPane.showInputDialog(null, "Digite sua idade: ");
                ida = Integer.parseInt(a);

                if (ida >= mdi) {
                    cont++;

                }
            }
            JOptionPane.showMessageDialog(null, "O número de pessoas maiores de idade é: " + cont);

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }
        
    }
}
