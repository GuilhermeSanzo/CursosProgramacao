/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author Guilherme
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc=10; cc<=100; cc+=10) {
            System.out.println(cc);
        }
        /*
        int cc=0;
        while (cc<4) {
            System.out.println("Cambalhota");
            cc++;
        }
        */
        System.out.println("------------------");
        for (int i=1; i<=3; i++) {           
            for (int j=0; j<=2; j+=2) {                
                System.out.println(i + " " + j);
            }
        }
    }
    
}
