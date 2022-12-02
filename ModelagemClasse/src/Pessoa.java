
public class Pessoa {

	private String nome;
	private String CPF;
	private int idade;

	public void cadastroPessoa(String nome, String CPF, int idade) {
		
		this.nome = nome;
		this.CPF = CPF;
		this.idade = idade;

	}
	public String getnome() {
		return this.nome;
	}
	
	public String getCPF() {
		return this.CPF;
		
	}
	public int getIdade() {
		return this.idade;
		
	}
}
