package listaexercicios;

import javax.swing.*;

public class Ex_06 {
    public static void main(String[] args) {
        int dia, mes, ano, ab, c;
        String a;
        
        a = JOptionPane.showInputDialog (null, "Qual dia você nasceu?");
        dia = Integer.parseInt(a);
        
        a = JOptionPane.showInputDialog (null, "Qual dia você nasceu?");
        mes = Integer.parseInt(a);
        
        a = JOptionPane.showInputDialog (null, "Qual dia você nasceu?");
        ano = Integer.parseInt(a);
        
        ab = 2016 - ano;
        while (c != 1){
            if (ab%4){
                c ++;
                ab = ab/4;
            }else{ab++;}}
        
        
        jan = 31;
        fev = 28;
        mar = 31;
        abr = 30;
        mai = 31;
        jun = 30;
        jul = 31;
        ago = 30;
        set = 31;
        out = 30;
        nov = 31;
        dec = 30;
        
        
    }
}
