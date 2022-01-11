
public class Main {

	public static void main(String[] args) {
		Cliente michelin = new Cliente();
		michelin.setNome("Michelin");
		
		Conta cc = new ContaCorrente(michelin);
		Conta poupanca = new ContaPoupanca(michelin);

		cc.depositar(300);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
