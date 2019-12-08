package listaexercicios;

import javax.swing.*;

public class Ex_04 {

    public static void main(String[] args) {

        String a;
        int lim;
        double n, rs = 0;
        try {
            a = JOptionPane.showInputDialog(null, "Digite a quantidade de números que serão digitados: ");
            lim = Integer.parseInt(a);

            for (int i = 0; i < lim; i++) {
                a = JOptionPane.showInputDialog(null, "Digite um número: ");
                n = Double.parseDouble(a);
                if (n >= 0) {
                    rs += n;
                } else {
                    JOptionPane.showMessageDialog(null, "!!!Número inválido, digite apenas números positivos!!!");
                    System.exit(0);
                }
            }
            JOptionPane.showMessageDialog(null, "O resultado final é: " + rs);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }

    }
}
