package view;
import javax.swing.JOptionPane;
import controller.Ex4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ex4 m = new Ex4();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ser convertido: "));
        while (num > 2000){
            JOptionPane.showMessageDialog(null,"O número não pode ser maior que 2000!");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um novo número para ser convertido: "));
        }
        System.out.println(m.frecbin(num));
    }
}