/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author Guilherme
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int idade = 100;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        */
        String valor = "100";
        int idade = Integer.parseInt(valor);
        System.out.println("Idade:" + idade);
        
        String valor2 = "9.5";
        float nota = Float.parseFloat(valor2);
        System.out.printf("Nota: %.2f \n", nota);
    }
    
}
