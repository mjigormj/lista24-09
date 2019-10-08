package listaexercicios;

import javax.swing.*;

public class Ex_14 {

    public static void main(String[] args) {

        String a, no, mida = null;
        int ida, menor = 1000;
        try{
        for (int i = 0; i < 10 ; i++) {

        no = JOptionPane.showInputDialog(null,"Digite um nome: ");

        a = JOptionPane.showInputDialog(null,"Digite uma idade: ");
        ida = Integer.parseInt(a);

        if (ida < menor) {
        menor = ida;
        mida = no;
            }

        }
        JOptionPane.showMessageDialog(null,"A pessoa mais nova e: "+mida);
        }
        catch (NullPointerException erro) {
        JOptionPane.showMessageDialog(null,"Obrigado, por utilizar nosso sistema");
    }
        System.exit(0);
    
    }
}