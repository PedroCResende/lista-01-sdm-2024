

public class Atleta {
    // Propriedades privadas
    private String nome;
    private int quantidadeMedalhas;
    private String pais;

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getQuantidadeMedalhas() {
        return quantidadeMedalhas;
    }

    public String getPais() {
        return pais;
    }

    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeMedalhas(int quantidadeMedalhas) {
        this.quantidadeMedalhas = quantidadeMedalhas;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Método para imprimir os dados do atleta
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de Medalhas: " + quantidadeMedalhas);
        System.out.println("País: " + pais);
    }
}