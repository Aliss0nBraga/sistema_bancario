
public class Principal {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Alisson", "96809337");
		Gerente g2 = new Gerente("Bruna", "55321212");

		ListaGerentes.gerentes.add(g1);
		ListaGerentes.gerentes.add(g2);
		
		System.out.printf("Os Dados do primeiro gerente � %s\n",g1.toString());
		System.out.printf("Os Dados do segundo gerente � %s\n",g2.toString());
		
	
		Cliente c1 = new Cliente("Patricio", "9595511455");
		Cliente c2 = new Cliente("jose", "9971633633");

		ListaClientes.clientes.add(c1);
		ListaClientes.clientes.add(c2);

		//System.out.printf("Os Dados do primeiro Cliente � %s\n",c1.toString());
		//System.out.printf("Os Dados do segundo Cliente � %s\n",c2.toString());

		ListaContas banco = new ListaContas();

		Conta conta1 = new Conta(55555, 444);
		Conta conta2 = new Conta(66666, 777);

		banco.addContas(conta1);
		banco.addContas(conta2);

		System.out.printf("Os dados da primeira conta �: %s\n", conta1.toString() );
		System.out.printf("Os dados da segunda conta �: %s\n", conta2.toString() );

	}

}
