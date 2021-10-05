
public class Cliente {
	public String nome;
	public String cpf;
	
	public Cliente(String nome, String cpf) { 
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return  "Cliente nome: " + getNome() +" cpf: " + getCpf() + "\n";
	}
	
	
}
