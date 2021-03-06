
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);	
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		
		Conta contaNova = new Conta();
		contaNova.deposita(1000);
		
		boolean sucessoTransferencia = contaNova.transfere(3000, conta);
		if(sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(contaNova.saldo);
		System.out.println(conta.saldo);
	}
}
