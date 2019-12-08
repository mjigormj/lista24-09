package listaexercicios;

import javax.swing.*;

public class Ex_12 {

    public static void main(String[] args) {

        String a;
        int n = 0, ant = 0, suc = 0;
        try {
            a = JOptionPane.showInputDialog(null, "Digite um número inteiro: ");
            n = Integer.parseInt(a);

            ant = n + 1;
            suc = n - 1;

            JOptionPane.showMessageDialog(null, "O número digitado é: " + n);
            JOptionPane.showMessageDialog(null, "O antecessor é: " + ant);
            JOptionPane.showMessageDialog(null, "O sucessor é: " + suc);

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }

    }
}

