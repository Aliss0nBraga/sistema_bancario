import java.util.ArrayList;

public class ListaGerentes {
	static ArrayList<Gerente> gerentes = new ArrayList<>();

	public void addGerentes(Gerente gerente) {
		if (gerente != null) {
			gerentes.add(gerente);
		}
	}

	public void removerGerentes(Gerente gerente) {
		gerentes.removeIf((elemento) -> elemento.getNome().equalsIgnoreCase(gerente.getNome()));

	}

	public Gerente buscar(Gerente gerente) {
		for (Gerente elemento : this.gerentes) {
			if (elemento.getNome().equalsIgnoreCase(gerente.getNome())) {
				return elemento;
			}
		}
		return null;

	}

	public void editar(Gerente gerente) {
		int indice = gerentes.indexOf(this.buscar(gerente)); // Procurar se o elemento está na Lista.
		if (indice != -1) { // Achou??
			gerentes.set(indice, gerente);
		}
	}

	public static String listar() {
		StringBuilder builder = new StringBuilder();
		for (Gerente gerente : ListaGerentes.gerentes) {
			builder.append("Nome: " + gerente.getNome() + " - Telefone: " + gerente.getTelefone() + "\n");
		}
		return builder.toString();
	}

}
