package listaexercicios;

import javax.swing.*;

public class Ex_07 {

    public static void main(String[] args) {
        
        String a;
        double produto, desc;
        try{
        a = JOptionPane.showInputDialog(null,"Digite o valor do produto: ");
        produto = Double.parseDouble(a);

        desc = produto / 100 * 9;
        produto -= desc;

        JOptionPane.showMessageDialog(null,"Novo preco: "+produto);
    }
        catch (NumberFormatException erro) {
        JOptionPane.showMessageDialog(null,"Houve erro na conversao, digite apenas caracteres numericos");
    }
        catch (NullPointerException erro) {
        JOptionPane.showMessageDialog(null,"Obrigado, por utilizar nosso sistema");
    }
        System.exit(0);
}
}
