public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito: " + valor + " - Saldo: " + saldo);
    }

    public synchronized void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque: " + valor + " - Saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque: " + valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void fecharConta() {
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
    }
}
