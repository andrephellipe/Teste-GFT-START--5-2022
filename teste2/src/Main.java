import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ContaCorrente contaCorrente = new ContaCorrente(1525,"André Felipe",1500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(4045,"Carlos Eduardo",2750);

        System.out.println("CONTA CORRENTE: ");
        System.out.println("NOME: " + contaCorrente.getTitular());
        System.out.println("NÚMERO: " + contaCorrente.getNumero());
        System.out.println("SALDO: " + contaCorrente.getSaldo());
        System.out.println("RENDIMENTO: " + String.format("%.2f",contaCorrente.rendimento()));

        System.out.println("=================================================");

        System.out.println("CONTA POUPANÇA: ");
        System.out.println("NOME: " +contaPoupanca.getTitular());
        System.out.println("NÚMERO: " + contaPoupanca.getNumero());
        System.out.println("SALDO: " + contaCorrente.getSaldo());
        System.out.println("RENDIMENTO: " + String.format("%.2f",contaPoupanca.rendimento()));

        System.out.println("=================================================");
    }
}
