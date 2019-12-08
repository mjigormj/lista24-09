package listaexercicios;

import javax.swing.*;

public class Ex_07 {

    public static void main(String[] args) {

        String a;
        double produto, desc;
        try {
            a = JOptionPane.showInputDialog(null, "Digite o valor do produto: ");
            produto = Double.parseDouble(a);

            desc = produto / 100 * 9;
            produto -= desc;

            JOptionPane.showMessageDialog(null, "Novo preço: R$" + produto);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }
        
    }
}

