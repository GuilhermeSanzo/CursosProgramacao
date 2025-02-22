/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, soma = 0, contador = 0, par = 0, impar = 0, acima100 = 0, media;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            soma += numero;
            contador++;
            if (numero % 2 == 0) {
                par++;
            } else if (numero % 2 == 1) {
                impar++;
            }
            if (numero > 100) {
                acima100++;
            }            
        } while (numero != 0);        
        media = soma / contador;
        JOptionPane.showMessageDialog(null, 
            "<html>" + 
            "Resultado: <hr>" + 
            "Somatória: " + soma + "<br>" + 
            "Total de Valores: " + contador + "<br>" + 
            "Total de Pares: " + par + "<br>" + 
            "Total de Ímpares: " + impar + "<br>" + 
            "Acima de 100: " + acima100 + "<br>" + 
            "Média dos valores: " + media + "<br>" + 
            "</html>",
            "Resultado Final",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
