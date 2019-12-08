package listaexercicios;

import javax.swing.*;

public class Ex_15 {
   
    public static void main(String[] args) {

        String a, st = null;
        int prato, sobremesa, bebida, calorias1 = 0, calorias2 = 0, calorias3 = 0, calorias = 0;
        try {
            a = JOptionPane.showInputDialog(null, "Digite um número para escolher uma opção:\n"
                    + "1 - Vegetariano\n"
                    + "2 - Peixe\n"
                    + "3 - Frango\n"
                    + "4 - Carne");
            prato = Integer.parseInt(a);

            switch (prato) {

                case 1:
                    st = "Vegetariano";
                    calorias1 = 180;
                    break;
                case 2:
                    st = "Peixe";
                    calorias1 = 230;
                    break;
                case 3:
                    st = "Frango";
                    calorias1 = 250;
                    break;
                case 4:
                    st = "Carne";
                    calorias1 = 350;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "!!!Este prato não existe!!! ");
                    System.exit(0);
            }

            a = JOptionPane.showInputDialog(null, "Digite um número para escolher uma opção:\n"
                    + "1 - Abacaxi\n"
                    + "2 - Sorvete diet\n"
                    + "3 - Mouse diet\n"
                    + "4 - Mouse chocolate");
            sobremesa = Integer.parseInt(a);

            switch (sobremesa) {

                case 1:
                    st = "Abacaxi";
                    calorias2 = 75;
                    break;
                case 2:
                    st = "Sorvete diet";
                    calorias2 = 110;
                    break;
                case 3:
                    st = "Mouse diet";
                    calorias2 = 170;
                    break;
                case 4:
                    st = "Mouse chocolate";
                    calorias2 = 200;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "!!!Este prato não existe!!! ");
                    System.exit(0);
            }

            a = JOptionPane.showInputDialog(null, "Digite um número para escolher uma opção:\n"
                    + "1 - Chá\n"
                    + "2 - Suco de laranja\n"
                    + "3 - Suco de melão\n"
                    + "4 - Refrigerante diet");
            bebida = Integer.parseInt(a);

            switch (bebida) {

                case 1:
                    st = "Chá";
                    calorias3 = 20;
                    break;
                case 2:
                    st = "Suco de laranja";
                    calorias3 = 70;
                    break;
                case 3:
                    st = "Suco de melão";
                    calorias3 = 100;
                    break;
                case 4:
                    st = "Refrigerante diet";
                    calorias3 = 65;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "!!!Este prato não existe!!! ");
                    System.exit(0);
            }

            calorias = calorias1 + calorias2 + calorias3;

            JOptionPane.showMessageDialog(null, "A quantidade de calorias da sua refeição é: " + calorias + " calorias");
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos.");
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema!");
        }

    }
}
