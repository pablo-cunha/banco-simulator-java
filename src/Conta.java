public class Conta implements IConta {
    // Atributos
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;

    // Métodos
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }

    @Override
    public boolean depositar(double valor) {
        return false;
    }

    @Override
    public boolean transferir(double valor, Conta contaDestino) {
        return false;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
