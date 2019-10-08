package listaexercicios;

import javax.swing.*;

public class Ex_06 {

    public static void main(String[] args) {
        int dia, mes = 0, ano, ab = 0, diaatu, mesatu, anoatu, dpe = 0, dpa = 0, idade, dvv;
        String a;
        try {
            /*dados de nascimento*/
            JOptionPane.showMessageDialog(null, "Digite a data referente ao seu nascimento");

            a = JOptionPane.showInputDialog(null, "Qual dia você nasceu?");
            dia = Integer.parseInt(a);

            a = JOptionPane.showInputDialog(null, "Qual mes você nasceu?");
            mes = Integer.parseInt(a);

            a = JOptionPane.showInputDialog(null, "Qual ano você nasceu?");
            ano = Integer.parseInt(a);

            /*dados atuais*/
            JOptionPane.showMessageDialog(null, "Agora Informe os dados atuais");

            a = JOptionPane.showInputDialog(null, "Qual dia é hoje?");
            diaatu = Integer.parseInt(a);

            a = JOptionPane.showInputDialog(null, "Qual e o mes atual?");
            mesatu = Integer.parseInt(a);

            a = JOptionPane.showInputDialog(null, "Qual o ano atual?");
            anoatu = Integer.parseInt(a);


            for(int i=1;i < mes; i++){
                switch(i){
                    case 1: dpe += 31;break;    /*Janeiro*/
                    case 2: dpe +=28;break;
                    case 3: dpe += 31;break;
                    case 4: dpe += 30;break;
                    case 5: dpe += 31;break;
                    case 6: dpe += 30;break;  /*Junho*/
                    case 7: dpe += 31;break;
                    case 8: dpe += 31;break;
                    case 9: dpe += 30;break;
                    case 10: dpe += 31;break;
                    case 11: dpe += 30;break;
                    case 12: dpe += 31;break;   /*Dezembro*/
            }
        }
        
            for(int i=1;i < mesatu; i++){
                switch(i){
                    case 1: dpa += 31;break;    /*Janeiro*/
                    case 2: dpa +=28;break;
                    case 3: dpa += 31;break;
                    case 4: dpa += 30;break;
                    case 5: dpa += 31;break;
                    case 6: dpa += 30;break;  /*Junho*/
                    case 7: dpa += 31;break;
                    case 8: dpa += 31;break;
                    case 9: dpa += 30;break;
                    case 10: dpa += 31;break;
                    case 11: dpa += 30;break;
                    case 12: dpa += 31;break;   /*Dezembro*/
            }
        }

            if (ano == anoatu && ano % 4 == 0 && mes < 3) {
                ab++;
            } else {
                int apoio = ano;
                while (apoio <= anoatu) {
                    if (apoio % 4 == 0) {
                        ab++;
                        apoio++;
                    } else {
                        apoio++;
                    }
                }
            }

            dpe += dia;
            idade = anoatu - ano;
            dvv = idade * 365;
            dvv -= dpe;
            dvv = dvv + dpa + diaatu;
            dvv += ab;

            JOptionPane.showMessageDialog(null, "Você viveu " + dvv + " dias.");
       
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversao, digite apenas caracteres numericos");
            
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }
        System.exit(0);
    }
}
