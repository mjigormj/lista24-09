
package listaexercicios;

import javax.swing.*;
public class Ex_01 {
    
    public static void main(String[] args) {
        String a;
        double sf, sal, pc;
        
        a = JOptionPane.showInputDialog(null, "Digite seu salario: ");
        sal = Double.parseDouble(a);

        a = JOptionPane.showInputDialog(null, "Digite a porcentagem de aumento: ");
        pc = Double.parseDouble(a);
        
        sf = sal + (sal/100)*pc ;
        
        JOptionPane.showMessageDialog(null, "O novo salario será: R$" + sf);
    }
    
}
