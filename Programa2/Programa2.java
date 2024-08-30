

public class Programa2 {
    public static void main(String[] args) {
        // Criação do objeto Atleta
        Atleta atleta = new Atleta();

        // Definindo os valores das propriedades usando os setters
        atleta.setNome("Cristiano Ronaldo");
        atleta.setQuantidadeMedalhas(0);
        atleta.setPais("Portugal");

        // Imprimir os dados do atleta
        atleta.imprimirDados();
    }
}