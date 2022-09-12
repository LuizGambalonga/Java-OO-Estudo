package heranca_polimorfismo;

public class ContaEmpresarial extends Conta{
	private Double limite;
	
	public ContaEmpresarial() {
		super();
	}
	
	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limite) {
		super(numero, titular, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public void Emprestimo (Double quantia) {
		if(quantia <= limite) {
		Deposito(quantia);
		}	
	}
	
	@Override
	public void Deposito(double quantia) {
		saldo += quantia + 1.50;
	}
	
	@Override
	public String toString() {
		return  "Numero Conta: " + getNumero()
				+ " Titular Conta: " + getTitular() 
				+ " Saldo Conta: " + getSaldo()
				+" Limite: " + limite;
	}

	
	
}
