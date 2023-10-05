public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1000);
        ContaBancaria conta2 = new ContaBancaria(2000);

        Thread threadDeposito1 = new Thread(new OperacaoBancaria(conta1, "DEPOSITO", 200));
        Thread threadSaque1 = new Thread(new OperacaoBancaria(conta1, "SAQUE", 500));
        Thread threadTransferencia = new Thread(new TransferenciaEntreContas(conta1, conta2, 300));
        Thread threadConsultaSaldo1 = new Thread(new ConsultaSaldo(conta1));
        Thread threadConsultaSaldo2 = new Thread(new ConsultaSaldo(conta2));
        Thread threadFechamento1 = new Thread(new FechamentoDeConta(conta1));

        threadDeposito1.start();
        threadSaque1.start();
        threadTransferencia.start();
        threadConsultaSaldo1.start();
        threadConsultaSaldo2.start();
        threadFechamento1.start();

        try {
            threadDeposito1.join();
            threadSaque1.join();
            threadTransferencia.join();
            threadConsultaSaldo1.join();
            threadConsultaSaldo2.join();
            threadFechamento1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Saldo final da Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo final da Conta 2: " + conta2.getSaldo());
    }
}
