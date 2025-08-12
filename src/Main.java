public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);
        Banco banco = new Banco("Banco 1");

        // Adicionando contas ao banco
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        System.out.println("Contas do banco: " + banco.getNome());
        banco.listarcontas();

        // Exibindo saldos zerados
        cc.exibirExtrato();
        poupanca.exibirExtrato();

        // Realizando operações de depósito, saque e transferência
        cc.depositar(200);
        poupanca.depositar(200);

        cc.sacar(9.9);
        cc.transferir(60, poupanca);
        poupanca.sacar(10);

        // Exibindo extratos após operações
        cc.exibirExtrato();
        poupanca.exibirExtrato();
    }
}
