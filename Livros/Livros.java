public class Livros {
    private String titulo;
    private String autor;
    private String editora;

    // Construtor
    public Livros(String titulo, String autor, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    // Construtor padrão (caso queira criar um objeto sem passar parâmetros)
    public Livros() {
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    // Método para imprimir os dados do livro
    public void imprimirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
    }

    public static void main(String[] args) {
        // Usando o construtor padrão para criar o objeto
        Livros livros = new Livros();

        // Definindo os atributos usando setters
        livros.setTitulo("Sítio do Picapau Amarelo");
        livros.setAutor("Monteiro Lobato");
        livros.setEditora("Globo");

        // Imprimindo os dados do livro
        livros.imprimirDados();
    }
}
