package lista2;

import javax.swing.*;

public class L2e2 {

    public static void main(String[] args) {
        String a, alunos[][] = new String[6][3];
        int al, nt, apr = 0, exa = 0, rep = 0;
        Double msl = 0.0, nota[][] = new Double[6][4], n1, n2;

        
        try{
            /*entrada de alunos e notas*/
            for (al = 0; al < 6; al++) {
                alunos[al][1] = JOptionPane.showInputDialog(null, "Digite o nome do " + (al + 1) + "º aluno");
                for (nt = 1; nt <= 2; nt++) {
                    a = JOptionPane.showInputDialog(null, "Digite a " + (nt) + "º nota do aluno(a) " + alunos[al][1]);
                    nota[al][nt] = Double.parseDouble(a);
                }
            }
            /*nota média*/
            for (al = 0; al < 6 ; al++) {
                n1 = 0.0;
                n1 += nota[al][1];
                n1 += nota[al][2];
                msl += n1;
                n2 = n1/2;
                
                nota[al][3] = n2;
                
                if (nota[al][3] > 7) {
                    alunos[al][2] = "Aprovado";
                    apr++;
                } else if (nota[al][3] >= 6 && nota[al][3] < 7) {
                    alunos[al][2] = "Exame";
                    exa++;
                } else {
                    alunos[al][2] = "Reprovado";
                    rep++;
                }
                //System.out.println(n2 + "   " + alunos[al][2]);
            }
            msl = msl / 6;

            /*saidas*/
            JOptionPane.showMessageDialog(null, alunos[0][1] + " " + nota[0][3] + "" + alunos[0][2] + "\n"
                + alunos[1][1] + " " + nota[1][3] + " " + alunos[1][2] + "\n"
                + alunos[2][1] + " " + nota[2][3] + " " + alunos[2][2] + "\n"
                + alunos[3][1] + " " + nota[3][3] + " " + alunos[3][2] + "\n"
                + alunos[4][1] + " " + nota[4][3] + " " + alunos[4][2] + "\n"
                + alunos[5][1] + " " + nota[5][3] + " " + alunos[5][2] + "\n");

            JOptionPane.showMessageDialog(null, "Média da sala: " + msl + "\n"
                    + "Aprovados: " + apr + "\n "
                    + "Em exame: " + exa + "\n "
                    + "Reprovados: " + rep);

        
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Não coloque letras no local das notas.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado, por utilizar nosso sistema");
        }
        System.exit(0);
    }
}
