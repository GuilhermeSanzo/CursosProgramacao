package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.4f, "Amarelo");
        c1.status();
        System.out.println("");
        Caneta c2 = new Caneta("Faber Castell", 0.5f, "Vermelha");
        c2.status();
        System.out.println("");
        Caneta c3 = new Caneta("Pilot", 1.0f, "Preta");
        c3.status();
    }    
}
