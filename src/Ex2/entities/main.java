package Ex2.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Ex2.entities.enums.NivelTrabalho;

public class main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		System.out.print("Entre com nome do seu Departamento");
		String departamentoNome = sc.nextLine();
		
		System.out.println("Logo abaixo digite todos os dados do TRABALHADOR --------------");
		
		System.out.println("Digite nome do trabalhador");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Informe seu nivel de qualificação");
		String nivelTrabalho = sc.nextLine();
		System.out.print("Informe salario base");
		Double salarioBase = sc.nextDouble();
		
		Trabalhador trabalhador1 = new Trabalhador(nomeTrabalhador, NivelTrabalho.valueOf(nivelTrabalho),
												  salarioBase, new Departamento(departamentoNome));
		System.out.print("Quantos contratos este trabalhador vai possuir: ");
		
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.print("Entre com o contrato numero "+i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date contratoDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração do Contrato: ");
			int horas = sc.nextInt();
			HorasContrato contrato = new HorasContrato(contratoDate, valorPorHora, horas);
			trabalhador1.AdicionarContrato(contrato);
			}
		System.out.println();
		System.out.println("Entre com o mês e ano para calcular a renda (MM/YYYY)");
		String mesEano = sc.next();
		int mes = Integer.parseInt(mesEano.substring(0, 2));
		int ano = Integer.parseInt(mesEano.substring(3));
		System.out.println("Nome Trabalhador: "+ trabalhador1.getNome());
		System.out.println("Departamento: "+ trabalhador1.getDepartamento().getName());
		System.out.println("Renda para "+ mesEano + ": " + String.format("%.2f", trabalhador1.Renda(ano, mes)));
		sc.close();
	}

}
