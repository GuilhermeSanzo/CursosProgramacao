/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author Guilherme
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    // Método sem retorno (procedimento)
    /*    
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    */
    // Método com retorno (função)
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        //soma(5,2);
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm);
    }
    
}
