package lista2;

import javax.swing.*;

public class L2e4 {

    public static void main(String[] args) {
        String a = "";
        int mesa = 0, quantMesas = 0, numMesas = 0, quantLugares = 0, lugares = 240, reserva[] = new int[41];
        try {
            for (int i = 1; i < 41; i++) {
                reserva[i] = 0;
            }
            while (true) {
                do {
                    a = JOptionPane.showInputDialog(null, "Digite a quantidade de mesas que deseja reservar: ");
                    quantMesas = Integer.parseInt(a);
                    if (Integer.parseInt(a) > 40 || Integer.parseInt(a) < 0) {
                        JOptionPane.showMessageDialog(null, "Você só pode escolher as mesas de 1 a 40.");
                    }
                } while (Integer.parseInt(a) > 40 || Integer.parseInt(a) < 0);
                if (Integer.parseInt(a) == 0) {
                    JOptionPane.showMessageDialog(null, "Houve erro na divisão, não é permitido o uso do zero.");
                    System.exit(0);
                }

                for (int j = 0; j < quantMesas; j++) {
                    do {
                        mesa = j + 1;
                        a = JOptionPane.showInputDialog(null, "Digite o número da " + mesa + "º mesa que deseja reservar: ");
                        numMesas = Integer.parseInt(a);

                        if (Integer.parseInt(a) > 40 || Integer.parseInt(a) < 0) {
                            JOptionPane.showMessageDialog(null, "Você só pode escolher as mesas de 1 a 40.");
                        }

                    } while (Integer.parseInt(a) > 40 || Integer.parseInt(a) < 0);
                    if (Integer.parseInt(a) == 0) {
                        JOptionPane.showMessageDialog(null, "Houve erro na divisão, não é permitido o uso do zero.");
                        System.exit(0);
                    }

                    do {
                        a = JOptionPane.showInputDialog(null, "Digite quantos lugares você deseja reservar para a mesa " + numMesas + ":");
                        quantLugares = Integer.parseInt(a);

                        if (Integer.parseInt(a) > 6 || Integer.parseInt(a) < 1) {
                            JOptionPane.showMessageDialog(null, "Você só pode escolher os lugares de 1 a 6.");
                        }
                    } while (Integer.parseInt(a) > 6 || Integer.parseInt(a) < 1);

                    if (reserva[numMesas] != 0) {
                        JOptionPane.showMessageDialog(null, "Esta mesa já foi reservada, tente reservar outra.");
                    } else if (lugares < 1) {
                        JOptionPane.showMessageDialog(null, "Não há lugares disponíveis para reserva neste momento");
                        System.exit(0);
                    }
                    reserva[numMesas] = Integer.parseInt(a);
                    lugares -= Integer.parseInt(a);
                    System.out.println("Mesa " + numMesas + " reservada com sucesso.");
                }

            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }
    }
}
