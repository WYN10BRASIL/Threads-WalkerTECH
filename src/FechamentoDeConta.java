public class FechamentoDeConta implements Runnable {
    private ContaBancaria conta;

    public FechamentoDeConta(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public void run() {
        conta.fecharConta();
    }
}
