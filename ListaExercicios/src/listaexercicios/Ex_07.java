package listaexercicios;

import javax.swing.*;

public class Ex_07 {

    public static void main(String[] args) {
        
        String a;
        Double produto, desc;

        a = JOptionPane.showInputDialog(null, "Digite o valor do produto");
        produto = Double.parseDouble(a);

        desc = produto / 100 * 9;
        produto -= desc;

        JOptionPane.showMessageDialog(null, "Novo preco: " + produto);
    }

}
