package aula11;

public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setSexo("M");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Irineu");
        p1.setEspecialidade("Programação");
        p1.setSalario(6000);
        p1.receberAumento(500);
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Cuca");
        t1.setRegistroProfisional(9001);
        t1.praticar();
    }
}
