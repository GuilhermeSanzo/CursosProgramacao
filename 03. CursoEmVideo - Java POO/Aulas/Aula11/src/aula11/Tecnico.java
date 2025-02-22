package aula11;

public class Tecnico extends Aluno {
    private int registroProfisional;
    
    public void praticar() {
        System.out.println("O técnico " + this.nome + " de registro " + this.registroProfisional +  " está praticando");
    }

    public int getRegistroProfisional() {
        return registroProfisional;
    }
    public void setRegistroProfisional(int registroProfisional) {
        this.registroProfisional = registroProfisional;
    }
}
