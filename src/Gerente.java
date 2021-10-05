
public class Gerente {
	public String nome;
	public String telefone;

	public Gerente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;

	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "" + getNome() + " telefone:" + getTelefone() + "\n";
	}
	

}
