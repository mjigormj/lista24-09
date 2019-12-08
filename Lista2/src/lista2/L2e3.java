package lista2;

import javax.swing.*;

public class L2e3 {

    public static void main(String[] args) {

        String a = null, sexoInf[] = new String[50];
        int sex, alt, ida, idadeInf[] = new int[50], menorIdMulher = 200, maiorIdHomem = 0;
        double alturaInf[] = new double[50], maiorAlt = 0, menorAlt = 3, mediaAlt = 0, contMulher = 0;
        try {
            for (int i = 0; i < 50; i++) {

                alt = i + 1;
                a = JOptionPane.showInputDialog(null, "Digite a " + alt + "º altura: ");
                alturaInf[i] = Double.parseDouble(a);

                if (alturaInf[i] > maiorAlt) {
                    maiorAlt = alturaInf[i];
                } else if (alturaInf[i] < menorAlt) {
                    menorAlt = alturaInf[i];
                }

                ida = i + 1;
                a = JOptionPane.showInputDialog(null, "Digite a " + ida + "º idade: ");
                idadeInf[i] = Integer.parseInt(a);

                sex = i + 1;
                sexoInf[i] = JOptionPane.showInputDialog(null, "Digite o " + sex + "º sexo: ");

                if ("F".equals(sexoInf[i])) {
                    mediaAlt += alturaInf[i];
                    contMulher++;

                } else if ("f".equals(sexoInf[i])) {
                    mediaAlt += alturaInf[i];
                    contMulher++;

                } else if ("M".equals(sexoInf[i])) {

                } else if ("m".equals(sexoInf[i])) {

                } else {
                    JOptionPane.showMessageDialog(null, "Houve um erro na conversão, Você digitou caracteres errados.");
                    System.exit(0);
                }

                if (idadeInf[i] > maiorIdHomem && "M".equals(sexoInf[i]) || "m".equals(sexoInf[i])) {
                    maiorIdHomem = idadeInf[i];
                } else if (idadeInf[i] < menorIdMulher && "F".equals(sexoInf[i]) || "f".equals(sexoInf[i])) {
                    menorIdMulher = idadeInf[i];
                }
            }
            System.out.println("A maior altura: " + maiorAlt + " cm");
            System.out.println("A menor altura: " + menorAlt + " cm");
            System.out.println("A média de altura de mulheres: " + mediaAlt / contMulher + " cm");
            System.out.println("A idade do homem mais velho: " + maiorIdHomem + " anos");
            System.out.println("A idade da mulher mais nova: " + menorIdMulher + " anos");

        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }

    }
}
