package listaexercicios;

import javax.swing.*;

public class Ex_09 {

 public static void main(String[] args){    
      
       String a;
       double ra, al, pi= 3.14159, volume;
       try{
       a = JOptionPane.showInputDialog(null,"Digite o raio: ");
       ra = Double.parseDouble(a);
       a = JOptionPane.showInputDialog(null,"Digite a altura: ");
       al = Double.parseDouble(a);
        
       volume= (ra * ra) * pi * al;
        
       JOptionPane.showMessageDialog(null,"Volume: "+volume+"cm");
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