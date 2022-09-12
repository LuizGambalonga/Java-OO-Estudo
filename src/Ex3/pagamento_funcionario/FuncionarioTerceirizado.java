package Ex3.pagamento_funcionario;

public class FuncionarioTerceirizado extends Funcionario{
	private Double pagamentoAdicionalTerceirizado;
	
	public FuncionarioTerceirizado() {
		super();
	}
	
	public FuncionarioTerceirizado(String nome, Integer horasTrabalhadas, Double valorPorHorasTrabalhadas,Double pagamentoAdicionalTerceirizado) {
		super(nome, horasTrabalhadas, valorPorHorasTrabalhadas);
		this.pagamentoAdicionalTerceirizado = pagamentoAdicionalTerceirizado;
	}

	public Double getPagamentoAdicionalTerceirizado() {
		return pagamentoAdicionalTerceirizado;
	}

	public void setPagamentoAdicionalTerceirizado(Double pagamentoAdicionalTerceirizado) {
		this.pagamentoAdicionalTerceirizado = pagamentoAdicionalTerceirizado;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + pagamentoAdicionalTerceirizado * 1.1;
	}
	
	@Override
	public String toString() {
		return  "Nome: " + getNome() 
				+ " Horas_Trabalhadas: " + getHorasTrabalhadas()
				+ " Valor_Por_Horas_Trabalhadas: "+ getValorPorHorasTrabalhadas()
				+ " Pagamento_Adicional_Terceirizado: "+ pagamentoAdicionalTerceirizado;
	}
}
