package listaexercicios;

import javax.swing.*;

public class Ex_13 {
    
    public static void main(String[] args) {
        
        String a;
        int ida, mdi=18, cont=0;
        try{
        for (int i=0; i < 20; i++) {
            
        a = JOptionPane.showInputDialog(null,"Digite sua idade: ");
        ida = Integer.parseInt(a);
        
        if (ida >= mdi){
        cont++;
            
        }}
        JOptionPane.showMessageDialog(null,"O numero de pessoas maiores de idade e: "+cont);
    
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