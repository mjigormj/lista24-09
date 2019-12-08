package listaexercicios;

import javax.swing.*;

public class Ex_01 {

    public static void main(String[] args) {

        String a;
        double sf, sal, pc;
        try {
            a = JOptionPane.showInputDialog(null, "Digite seu salário: ");
            sal = Double.parseDouble(a);

            a = JOptionPane.showInputDialog(null, "Digite a porcentagem de aumento: ");
            pc = Double.parseDouble(a);

            sf = sal + (sal / 100) * pc;

            JOptionPane.showMessageDialog(null, "O novo salário será: R$" + sf);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }

    }
}
