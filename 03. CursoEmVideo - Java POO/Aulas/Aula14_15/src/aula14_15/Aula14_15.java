package aula14_15;

public class Aula14_15 {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 03 de PHP");
        
        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        
        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(85.0f);
        System.out.println(vis[1].toString());
    }
}
