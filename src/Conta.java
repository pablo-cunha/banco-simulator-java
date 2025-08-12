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
        if(valor <= 0 || valor > this.saldo) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    @Override
    public boolean depositar(double valor) {
        if(valor <= 0) {
            return false;
        } else {
            this.saldo += valor;
            return true;
        }
    }

    @Override
    public boolean transferir(double valor, Conta contaDestino) {
        return this.sacar(valor) && contaDestino.depositar(valor);
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
