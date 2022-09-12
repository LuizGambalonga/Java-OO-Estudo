package Ex3.pagamento_funcionario;

public class Funcionario {
	private String nome;
	private Integer horasTrabalhadas;
	private Double valorPorHorasTrabalhadas;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, Integer horasTrabalhadas, Double valorPorHorasTrabalhadas) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHorasTrabalhadas = valorPorHorasTrabalhadas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public Double getValorPorHorasTrabalhadas() {
		return valorPorHorasTrabalhadas;
	}
	public void setValorPorHorasTrabalhadas(Double valorPorHorasTrabalhadas) {
		this.valorPorHorasTrabalhadas = valorPorHorasTrabalhadas;
	}

	public double pagamento() {
		return horasTrabalhadas * valorPorHorasTrabalhadas;
	}

	@Override
	public String toString() {
		return  "Nome: " + nome 
				+ " Horas_Trabalhadas: " + horasTrabalhadas
				+ " Valor_Por_Horas_Trabalhadas: "+ valorPorHorasTrabalhadas;
	}
	
}
