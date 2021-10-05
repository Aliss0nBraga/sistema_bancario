
public class Conta {
	public int numero;
	public float saldo;
	
	public Conta(int numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo; 
			
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return   + getNumero() + + getSaldo() + "\n";
	}
}
