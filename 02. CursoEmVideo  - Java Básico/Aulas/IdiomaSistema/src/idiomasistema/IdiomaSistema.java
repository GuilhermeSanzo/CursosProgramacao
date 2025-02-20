package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        
        Locale idiomaSistema = Locale.getDefault();
        
        System.out.println("Seu sistema está em " + idiomaSistema.getDisplayLanguage());
        
    }
    
}
