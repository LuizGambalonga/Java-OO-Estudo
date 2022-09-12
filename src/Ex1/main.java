package Ex1;
import java.util.Date;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido pedido = new Pedido(180, new Date(), OrdemStatus.ENTREGUE);
		System.out.println(pedido);
		
		OrdemStatus os1 = OrdemStatus.ENTREGUE;
		OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");
		System.out.println(os1);
		System.out.println(os2);
		Pedido pedido2 = new Pedido();
		System.out.println(pedido2);
	}

}
