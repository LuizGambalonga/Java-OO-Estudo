package Ex2.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import Ex2.entities.enums.NivelTrabalho;

public class Trabalhador {
	private String nome;
	private NivelTrabalho nivelTrabalho;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}
	
	public Trabalhador(String nome, NivelTrabalho nivelTrabalho, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivelTrabalho = nivelTrabalho;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalho getNivelTrabalho() {
		return nivelTrabalho;
	}

	public void setNivelTrabalho(NivelTrabalho nivelTrabalho) {
		this.nivelTrabalho = nivelTrabalho;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContratos() {
		return contratos;
	}

	public void AdicionarContrato(HorasContrato horaContrato) {
		contratos.add(horaContrato);
	}
	
	public void RemoverContrato(HorasContrato horaContrato) {
		contratos.remove(horaContrato);
	}
	public double Renda(int ano, int mes) {
		double soma =salarioBase;
		Calendar cal = Calendar.getInstance();
		for(HorasContrato c: contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1+ cal.get(Calendar.MONTH);
			
			if(ano == c_ano && mes ==c_mes) {
				soma += c.totalContrato();
			}
		}
		
		return soma;
	}
	@Override
	public String toString() {
		return "Trabalhador [nome=" + nome + ", nivelTrabalho=" + nivelTrabalho + ", salarioBase=" + salarioBase
				+ ", departamento=" + departamento + "]";
	}
	
	
}
