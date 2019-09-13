package listaexercicios;

import javax.swing.*;

public class Ex_04 {

    public static void main(String[] args) {
        double n, rs = 0;
        int limite;
        String a;
        
        try {
            a = JOptionPane.showInputDialog(null, "Digite a quantidade de numeros que serao digitados");
            limite = Integer.parseInt(a);

            for (int i = 0; i < limite; i++) {
                a = JOptionPane.showInputDialog(null, "Digite um numero: ");
                a = a.replace(",", ".");
                n = Double.parseDouble(a);
                if (n >= 0) {
                    rs += n;
                } else {
                    JOptionPane.showMessageDialog(null, "!!!!Numero invalido!!!");
                    System.exit(0);
                }
            }
            JOptionPane.showMessageDialog(null, "O resultado final e:" + rs);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite Apenas Valores Numericos");
            System.exit(0);
        }
    }
}
