package heranca_polimorfismo;

public class main_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta(1000, "LUIZ GAMBALONGA", 1500.0);
		ContaEmpresarial ce1 = new ContaEmpresarial(5000, "TRANSPORTES ZEZINHO", 50000.0, 200000.0);
		ce1.Deposito(15);
		Conta c2 = ce1;
		ContaEmpresarialPlus cep = new ContaEmpresarialPlus(1050, "ZEZINHODAFEIRA", 1450.0, 2000.0, 50.0);
		System.out.println("CONTA NORMAL: "+c1);
		System.out.println("CONTA EMPRESARIAL: "+c2);
		System.out.println("CONTA EMPRESARIAL PLUS: "+cep);
	}

}
