package listaexercicios;

import javax.swing.*;

public class Ex_11 {

    public static void main(String[] args) {

        String senha, a, conf;
        double n1, n2, res;
        try {
            senha = JOptionPane.showInputDialog(null, "Digite uma senha: ");

            a = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
            n1 = Double.parseDouble(a);

            a = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
            n2 = Double.parseDouble(a);

            if (n2 == 0) {
                JOptionPane.showMessageDialog(null, "Houve erro na divisão, não é permitido o uso do zero.");
                System.exit(0);
            }

            res = n1 / n2;

            conf = JOptionPane.showInputDialog(null, "Confirme sua senha: ");

            if (conf == null ? senha == null : conf.equals(senha)) {
                JOptionPane.showMessageDialog(null, "O resultado da conta é: " + res);
            } else {
                JOptionPane.showMessageDialog(null, "!!!A senha digitada está errada!!!");
                System.exit(0);
            }

        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }

    }
}
