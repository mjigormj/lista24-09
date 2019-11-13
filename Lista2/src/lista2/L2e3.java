package lista2;

import javax.swing.*;


public class L2e3 {
    public static void main(String[] args) {
        double alturaInf = 0;
        char sexoInf = 0;
        int idadeInf = 0;
        double maiorAlt = 0.0, menorAlt = 5.0, mediaAlt = 0.0, contMulher = 0;
        int menorIdMulher = 200, maiorIdHomem = 0;
        double alt, alturas[] = new double[3];
        int ida, idades[] = new int[3];
        String sexos[] = new String[3];
        String a = null;

        for (int i = 0; i < 3; i++) {
            alt = i + 1;
            a = JOptionPane.showInputDialog(null, " Digite a " + alt + " altura ");
            alturas[i] = Double.parseDouble(a);

            if (alturaInf > maiorAlt) {
                maiorAlt = alturaInf;
            } else if (alturaInf < menorAlt) {
                menorAlt = alturaInf;
            }

            boolean saida = false;
            while (saida == false) {
                sexos[i] = JOptionPane.showInputDialog(null, " Digite o seu sexo ");
                

                if ("F".equals(sexos[i])) {
                    mediaAlt += alturaInf;
                    contMulher++;
                    saida = true;
                } else if("f".equals(sexos[i])) {
                    mediaAlt += alturaInf;
                    contMulher++;
                    saida = true;
                    
                }else if ("M".equals(sexos[i])) {
                    saida = true;
                } else if("m".equals(sexos[i])) {
                    saida = true;
                }else {
                    JOptionPane.showMessageDialog(null, "Você digitou caracteres errados!!");
                }
            }

            ida = i + 1;
            a = JOptionPane.showInputDialog(null, " Digite a " + ida + " sua idade ");
            idades[i] = Integer.parseInt(a);

            if (idadeInf > maiorIdHomem && sexoInf == 'M' || sexoInf == 'm') {
                maiorIdHomem = idadeInf;
            } else if (idadeInf < menorIdMulher && sexoInf == 'F' || sexoInf == 'f') {
                menorIdMulher = idadeInf;
            }

        }
        System.out.println("A maior altura: " + maiorAlt);
        System.out.println("A menor altura: " + menorAlt);
        System.out.println("\nA media de altura de Mulheres: " + mediaAlt / contMulher);
        System.out.println("\nA idade do homem mais velho: " + maiorIdHomem);
        System.out.println("A idade da mulher mais nova: " + menorIdMulher);

    }

}

