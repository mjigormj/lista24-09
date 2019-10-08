package listaexercicios;

import javax.swing.*;

public class Ex_08 {

    public static void main(String[] args) {
        String a;
        double sl;
        int vhad, qam, escolha, inss=0;
        try{
        a = JOptionPane.showInputDialog(null,"Digite o valor da hora de aula dada: ");
        vhad = Integer.parseInt(a);
        
        a = JOptionPane.showInputDialog(null,"Digite a quantidade de aulas dadas por mes: ");
        qam = Integer.parseInt(a);
       
        a = JOptionPane.showInputDialog(null,"Escolha o percentual de desconto do INSS:\n"
                + "1 - 8%\n"
                + "2 - 9%\n"
                + "3 - 11%");
        escolha = Integer.parseInt(a);
        
        switch(escolha){
            
        case 1:inss = 8;break;
        case 2:inss = 9;break;
        case 3:inss = 11;break;
            
        }
        
        sl = vhad * qam;
        inss = (int) (sl/100 * inss);
        sl -= inss;
         
        JOptionPane.showMessageDialog(null,"O seu salario liquido sera: "+sl);
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

    