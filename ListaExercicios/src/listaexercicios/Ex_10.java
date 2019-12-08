package listaexercicios;

import javax.swing.*;

public class Ex_10 {

    public static void main(String[] args) {

        String a;
        Double tgnv, vm, dis, lu;
        try {
            a = JOptionPane.showInputDialog(null, "Digite em horas o tempo gasto na viagem: ");
            tgnv = Double.parseDouble(a);

            a = JOptionPane.showInputDialog(null, "Digite a velocidade média: ");
            vm = Double.parseDouble(a);

            dis = tgnv * vm;
            lu = dis / 12;

            JOptionPane.showMessageDialog(null, "Distância percorrida: " + dis + " km");
            JOptionPane.showMessageDialog(null, "Litros usados: " + lu + " litros");
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }

    }
}
