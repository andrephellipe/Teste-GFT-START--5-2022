public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    double rendimento() {
        return this.getSaldo() * 0.03;
    }
}
