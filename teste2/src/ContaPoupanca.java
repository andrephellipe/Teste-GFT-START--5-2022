public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    double rendimento() {
        return this.getSaldo() * 0.05;
    }
}
