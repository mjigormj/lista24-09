package listaexercicios;

import javax.swing.*;

public class Ex_02 {

    public static void main(String[] args) {
        String a;
        double sf, sal, cred;

        a = JOptionPane.showInputDialog(null, "Digite seu salario: ");
        sal = Double.parseDouble(a);

        a = JOptionPane.showInputDialog(null, "Digite o credito requisitado: ");
        cred = Double.parseDouble(a);

        sf = (sal / 100) * 30;

        if (cred <= sf) {
            JOptionPane.showMessageDialog(null, "Seu credito foi aceito");
        } else if(cred > sf){
            JOptionPane.showMessageDialog(null, "Seu credito foi negado");
            
        }
    }

}
