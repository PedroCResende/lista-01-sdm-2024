public class Universidade {
	
	//Propriedades privadas
	private String nome;
	private String CNPJ;
	private String endereço;
	private int QtdeSalas;

	//Construtor para inicializar as propriedades
	public Universidade(String nome, String CNPJ, String endereço, int QtdeSalas) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.endereço = endereço;
		this.QtdeSalas = QtdeSalas;
	}
	
	//Métodos getter para acessar as propriedades
	public String getnome() {
		return nome;
		}
	
	public String getCNPJ() {
		return CNPJ;
		}
		
	public String getendereço() {
		return endereço;
	
		}
	
	public int getQtdeSalas() {
		return QtdeSalas;
		}
	
	//Método para imprimpir os dados da universidade
	 public void imprimirDados() {
	        System.out.println("Nome: " + nome);
	        System.out.println("CNPJ: " + CNPJ);
	        System.out.println("Endereço: " + endereço);
	        System.out.println("Quantidade de Salas: " + QtdeSalas);
	    }
}