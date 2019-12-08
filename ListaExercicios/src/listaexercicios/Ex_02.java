package listaexercicios;

import javax.swing.*;

public class Ex_02 {

    public static void main(String[] args) {

        String a;
        double sf, sal, cred;
        try {
            a = JOptionPane.showInputDialog(null, "Digite seu salário: ");
            sal = Double.parseDouble(a);

            a = JOptionPane.showInputDialog(null, "Digite o crédito requisitado: ");
            cred = Double.parseDouble(a);

            sf = (sal / 100) * 30;

            if (cred <= sf) {
                JOptionPane.showMessageDialog(null, "Seu crédito foi aceito.");
            } else if (cred > sf) {
                JOptionPane.showMessageDialog(null, "Seu crédito foi negado.");
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }

    }
}

