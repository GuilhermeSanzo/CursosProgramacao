package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        
        Dimension resolucaoTela = Toolkit.getDefaultToolkit().getScreenSize();
        
        int largura = (int) resolucaoTela.getWidth();
        int altura = (int) resolucaoTela.getHeight();
        
        System.out.println("Sua tela tem resolução " + largura + " x " + altura);
        
    }
    
}
