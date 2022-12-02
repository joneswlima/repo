
public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.cadastroPessoa("Jonin", "32371126829", 38);
		
		System.out.println("Nome do Cidadão é: " + pessoa.getnome());
		System.out.println("Portador do CPF: " + pessoa.getCPF());
		System.out.println("Cuja idade: " + pessoa.getIdade());
		
		
		
Pessoa pessoa2 = new Pessoa();
		
		pessoa2.cadastroPessoa("Buda", "32371126830", 30);
		
		System.out.println("Nome do Cidadão é: " + pessoa2.getnome());
		System.out.println("Portador do CPF: " + pessoa2.getCPF());
		System.out.println("Cuja idade: " + pessoa2.getIdade());
	}

}
