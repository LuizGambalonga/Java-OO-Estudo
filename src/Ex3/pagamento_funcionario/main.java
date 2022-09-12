package Ex3.pagamento_funcionario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<>();
		System.out.println("Digite a quantidade funcionarios para calcular os pagamentos: ");
		int n = sc.nextInt();
		
		for (int i=1; i <=n; i++) {
			System.out.println("Funcionario Numero "+ i);
			sc.nextLine();
			System.out.println("É um funcionario terceirizado?");
			char cha = sc.next().charAt(0);
			System.out.println("Digite o Nome do Funcionario");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite a quantidade de horas trabalhadas : ");
			Integer quantidadeHorasTrabalhada = sc.nextInt();
			System.out.println("Digite o valor que cada hora custa: ");
			Double valorPorHoraTrabalhada = sc.nextDouble();
			
			if(cha =='y') {
				System.out.println("Despesa Adicional de Tercerizado");
				double despesaAdicional = sc.nextDouble();
				Funcionario terceirizado = new FuncionarioTerceirizado(nome, quantidadeHorasTrabalhada, valorPorHoraTrabalhada, despesaAdicional);
				funcionarios.add(terceirizado);
			}else {
				Funcionario funcionarioNormal = new Funcionario(nome, quantidadeHorasTrabalhada, valorPorHoraTrabalhada);
				funcionarios.add(funcionarioNormal);
			}
			System.out.println("---------------------------------");
			
		}
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Funcionario: --- "+ funcionario + " Pagamento: ----"+ String.format("%.2f", funcionario.pagamento()));
		}
		sc.close();
	}

}
