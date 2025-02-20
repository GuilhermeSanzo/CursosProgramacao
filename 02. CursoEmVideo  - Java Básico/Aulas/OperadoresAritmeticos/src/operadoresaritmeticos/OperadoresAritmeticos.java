/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);*/
        
        /*int numero = 10;
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);*/
        
        /* int x = 4;
        x += 2;
        System.out.println(x);*/

        /*Scanner leitor = new Scanner(System.in);        
        System.out.print("Digite o numerador: ");
        int n = leitor.nextInt();
        System.out.print("Digite o denominador: ");
        int d = leitor.nextInt();
        float div = n / d;
        float resto = n % d;
        float raiz = (float) Math.sqrt(n);
        System.out.println("O resultado da divisão é: " + div);
        System.out.println("O resultado do resto é: " + resto);
        System.out.println("A raiz quadrada do numerador é: " + raiz);*/
        
        /*float v = 8.6f;
        int arredondarAbsoluto = (int) Math.abs(v);
        int arredondarAritmetico = (int) Math.round(v);
        int arredondarPraBaixo = (int) Math.floor(v);
        int arredondarPraCima = (int) Math.ceil(v);        
        System.out.println("Arredondamento absoluto: " + arredondarAbsoluto);
        System.out.println("Arredondamento aritmético: " + arredondarAritmetico);
        System.out.println("Arredondamento pra baixo: " + arredondarPraBaixo);
        System.out.println("Arredondamento pra cima: " + arredondarPraCima);*/
        
        double ale = Math.random();
        int n = (int) (1 + ale * (10-1));
        System.out.println(n);
    }
    
}
