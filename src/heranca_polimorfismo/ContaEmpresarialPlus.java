package heranca_polimorfismo;

public class ContaEmpresarialPlus extends ContaEmpresarial{
	

	private Double bonus;
	
	public ContaEmpresarialPlus() {
		
	}
	
	public ContaEmpresarialPlus(Integer numero, String titular, Double saldo, Double limite, Double bonus) {
		super(numero, titular, saldo, limite);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return  "Numero Conta: " + getNumero()
				+ " Titular Conta: " + getTitular() 
				+ " Saldo Conta: " + getSaldo()
				+" Limite: " + getLimite()
				+" Bonus: " + bonus;
	}
	
	
}
