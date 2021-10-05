
import java.util.ArrayList;

public class ListaContas {
	static ArrayList<Conta> contas = new ArrayList<>();

	public void addContas(Conta conta) {
		if (conta != null) {
			contas.add(conta);
		}
	}

	public void removerContas(Conta conta) {
		contas.removeIf((elemento) -> elemento.getNumero() == (conta.getNumero()));

	}

	public Conta buscar(Conta conta) {
		for (Conta elemento : ListaContas.contas) {
			if (elemento.getNumero() == conta.getNumero()) {
				return elemento;
			}
		}
		return null;
	}
    public void editar(Conta conta) {
        int indice = contas.indexOf(buscar(conta));
        if (indice != -1) {
            contas.set(indice, conta);
        }
    }

    public String listar() {
        StringBuilder builder = new StringBuilder();
        for (Conta conta : ListaContas.contas) {
            builder.append("Nº da conta: " + conta);
        }
        return builder.toString();
    }
}