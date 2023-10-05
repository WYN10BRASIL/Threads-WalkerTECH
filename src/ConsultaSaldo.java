public class ConsultaSaldo implements Runnable {
    private ContaBancaria conta;

    public ConsultaSaldo(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public void run() {
        double saldo = conta.getSaldo();
        System.out.println("Saldo da Conta: " + saldo);
    }
}
