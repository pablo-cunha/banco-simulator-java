public class ContaCorrente extends Conta {
    // Métodos
    public ContaCorrente() {
        super();
    }

    @Override
    public void exibirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.printf("Agencia: %d%n", super.getAgencia());
        System.out.printf("Conta: %d%n", super.getNumero());
        System.out.printf("Saldo: %.2f%n", super.getSaldo());
    }
}
