package listaexercicios;

import javax.swing.*;

public class Ex_06 {
    public static void main(String[] args) {
        int dia, mes = 0, ano, ab, diaatu, mesatu, anoatu, dpe=0, idade, dvv;
        String a;
        
        /*dados de nascimento*/
        
        a = JOptionPane.showInputDialog (null, "Qual dia você nasceu?");
        dia = Integer.parseInt(a);
        
        a = JOptionPane.showInputDialog (null, "Qual mes você nasceu?");
        mes = Integer.parseInt(a);
        
        a = JOptionPane.showInputDialog (null, "Qual ano você nasceu?");
        ano = Integer.parseInt(a);
        
        /*dados atuais*/
        
        a = JOptionPane.showInputDialog (null, "Qual dia é hoje?");
        diaatu = Integer.parseInt(a);
        
        a = JOptionPane.showInputDialog (null, "Qual e o mes atual?");
        mesatu = Integer.parseInt(a);
        
        a = JOptionPane.showInputDialog (null, "Qual o ano atual?");
        anoatu = Integer.parseInt(a);
        
        ab = 2016 - ano;
        int cont = 0;
        while (cont == 0){
            if (ab%4==0){
                cont ++;
                ab = ab/4;
            }else{ab++;}}
            
        for(int i=1;i < mes;i++){
            switch(i){
                case 1: dpe += 31;break;
                case 2: dpe +=28;break;
                case 3: dpe += 31;break;
                case 4: dpe += 30;break;
                case 5: dpe += 31;break;
                case 6: dpe += 30;break;  /*junho*/
                case 7: dpe += 31;break;
                case 8: dpe += 31;break;
                case 9: dpe += 30;break;
                case 10: dpe += 31;break;
                case 11: dpe += 30;break;
                case 12: dpe += 31;break;}
        }
            
        System.out.println("Anos bissextos: "+ ab);
        
            dpe += dia;
        System.out.println("meses mais dias: "+ dpe);
        
            idade = anoatu - ano;
            System.out.println("idade: "+ idade);
            
            dvv = idade * 365;
            dvv -= dpe;
            dvv += ab;
            
        System.out.println("dias vividos: "+ dvv);
    }
}
