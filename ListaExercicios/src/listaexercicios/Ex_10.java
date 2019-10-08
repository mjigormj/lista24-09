package listaexercicios;

import javax.swing.*;

public class Ex_10 {
    
    public static void main(String[] args) {
        
       String a;
       Double tgnv, vm, dis,  lu;
       try{
       a = JOptionPane.showInputDialog("Digite o tempo gasto na viagem: ");
       tgnv = Double.parseDouble(a);
       
       a = JOptionPane.showInputDialog("Digite a velocidade media: ");
       vm = Double.parseDouble(a);
       
       dis = tgnv * vm;
       lu = dis/12;
       
       JOptionPane.showMessageDialog(null,"Distancia percorrida: "+dis);
       JOptionPane.showMessageDialog(null,"Litros usados: "+lu);
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