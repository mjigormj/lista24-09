package listaexercicios;

import javax.swing.*;

public class Ex_12 {
    
    public static void main(String[] args) {
        
    String a;
    int n=0, ant=0, suc=0;
    try{
    a = JOptionPane.showInputDialog(null,"Digite um numero inteiro: ");
    n = Integer.parseInt(a);
    
    ant = n + 1;
    suc = n - 1;
    
    JOptionPane.showMessageDialog(null,"O numero digitado e: "+n);
    JOptionPane.showMessageDialog(null,"O antecessor e: "+ant);
    JOptionPane.showMessageDialog(null,"O sucessor e: "+suc);
    
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
