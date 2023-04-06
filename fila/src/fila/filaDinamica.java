/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fila;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class filaDinamica {
    static int op = 0;
    static Fila fila = new Fila();
    
    public static void main(String[] args) {
        do {            
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção "
            + "\n 1 - Enfileirar"
            + "\n 2 - Início "
            + "\n 3 - Desinfileirar"
            + "\n 4 - Exibir fila"   
            ));
            switch(op){
            case 1:
                fila.enfileirar(JOptionPane.showInputDialog("Digite a tarefa: "));
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Primeira tarefa: "+(String)fila.primeiroFila());
                break;
            case 3:
                JOptionPane.showMessageDialog(null,(String)fila.desinfilerar()+" tarefa feita: ");
                break;
            case 4:
                JOptionPane.showInputDialog("Tarefas "+ fila.exibirFila());
                break;
                  }
        } while (op!=0);
    }
    
    
    
    
    
}
