public class ContaPoupanca extends Conta{
    // Métodos
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", super.getAgencia());
        System.out.printf("Conta: %d%n", super.getNumero());
        System.out.printf("Saldo: %.2f%n", super.getSaldo());
    }
}
