import java.util.ArrayList;
import java.util.List;

public class Banco {
    // Atributos
    private String nome;
    private List<Conta> contas;

    // Métodos
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void listarcontas() {
        System.out.println(contas);
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
}