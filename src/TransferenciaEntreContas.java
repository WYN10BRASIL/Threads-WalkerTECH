public class TransferenciaEntreContas implements Runnable {
    private ContaBancaria contaOrigem;
    private ContaBancaria contaDestino;
    private double valor;
    private ContaBancaria conta1;
    private ContaBancaria conta2;

    public TransferenciaEntreContas(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    @Override
    public void run() {
        contaOrigem.transferir(contaDestino, valor);

// No método main ou em algum outro lugar adequado
Thread threadTransferencia = new Thread(new TransferenciaEntreContas(conta1, conta2, 300));
threadTransferencia.start();
    }

    public ContaBancaria getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(ContaBancaria contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public ContaBancaria getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(ContaBancaria contaDestino) {
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ContaBancaria getConta1() {
        return conta1;
    }

    public void setConta1(ContaBancaria conta1) {
        this.conta1 = conta1;
    }

    public ContaBancaria getConta2() {
        return conta2;
    }

    public void setConta2(ContaBancaria conta2) {
        this.conta2 = conta2;
    }
}
