package lista2;

import javax.swing.*;

public class L2e2 {

    public static void main(String[] args) {
        String a, alunos[][] = new String[6][2];
        int al, nt, apr = 0, exa = 0, rep = 0;
        Double msl = null, nota[][] = new Double[6][3], n1, n2;

            /*entrada de alunos e notas*/
            for (al = 0; al < 3; al++) {
                alunos[al][1] = JOptionPane.showInputDialog(null, "Digite o nome do " + (al + 1) + "º aluno");
                for (nt = 1; nt <= 2; nt++) {
                    a = JOptionPane.showInputDialog(null, "Digite a " + (nt) + "º nota do aluno(a) " + alunos[al][1]);
                    nota[al][nt] = Double.parseDouble(a);
                }
            }
            /*nota média*/
            for (al = 0; al < 6; al++) {
                n1 = nota[al][1];
                n2 = nota[al][2];
                n1 += n2;
                n2 = n1/2;
                System.out.println(n2);
                nota[al][3] = n2;
                if (nota[al][3] > 7) {
                    alunos[al][2] = "Aprovado";
                    apr++;
                } else if (nota[al][3] >= 3 && nota[al][3] < 7) {
                    alunos[al][2] = "Exame";
                    exa++;
                } else {
                    alunos[al][2] = "Reprovado";
                    rep++;
                }

                msl = nota[al][3];
            }
            msl = msl / 6;

            /*saidas*/
            for (al = 0; al < 6; al++) {
                JOptionPane.showMessageDialog(null, alunos[al][1] + " " + nota[al][3] + "" + alunos[al][2]);
            }

            JOptionPane.showMessageDialog(null, "Média da sala: " + msl + "\n"
                    + "Aprovados: " + apr + "\n "
                    + "Em exame: " + exa + "\n "
                    + "Reprovados: " + rep);

        
    }
}
