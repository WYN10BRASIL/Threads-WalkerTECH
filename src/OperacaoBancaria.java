public class OperacaoBancaria implements Runnable {
    private ContaBancaria conta;
    private String tipo;
    private double valor;

    public OperacaoBancaria(ContaBancaria conta, String tipo, double valor) {
        this.conta = conta;
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public void run() {
        if (tipo.equals("DEPOSITO")) {
            conta.depositar(valor);
        } else if (tipo.equals("SAQUE")) {
            conta.sacar(valor);
        }
    }
}
