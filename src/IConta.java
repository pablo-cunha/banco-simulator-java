public interface IConta {

    // Métodos
    boolean sacar(double valor);
    boolean depositar(double valor);
    boolean transferir(double valor, Conta contaDestino);
}
