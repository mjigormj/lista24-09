package listaexercicios;

import javax.swing.JOptionPane;

public class Ex_05 {

    public static void main(String[] args) {
        int i = 5, j, k;
        j = --i;
        k = i++;
        i += 10;
  
        JOptionPane.showMessageDialog(null, "Valor i igual a: " + i +"\nValor j igual a: " + j +"\nValor k igual a: " + k);
    }
}
