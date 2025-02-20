/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author Guilherme
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ano = 2025;
        int diasFev;
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            diasFev = 29;
        } else {
            diasFev = 28;
        }
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, diasFev, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("No ano de " + ano + " cada mês terá:");
        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo.");
        }
    }
    
}
