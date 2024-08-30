public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    // Construtor com parâmetros
    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    // Construtor padrão (sem parâmetros)
    public Pessoa() {
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para imprimir os dados da pessoa
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        // Usando o construtor padrão para criar o objeto
        Pessoa pessoa = new Pessoa();

        // Definindo os atributos usando setters
        pessoa.setNome("Pedro");
        pessoa.setSobrenome("Carvalho");
        pessoa.setIdade(20);

        // Imprimindo os dados da pessoa
        pessoa.imprimirDados();
    }
}
