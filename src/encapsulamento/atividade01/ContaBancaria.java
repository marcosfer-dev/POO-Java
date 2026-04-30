package encapsulamento.atividade01;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        if (numeroConta == null || numeroConta.isBlank()) {
            throw new IllegalArgumentException("Número da conta inválido");
        }

        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular inválido");
        }

        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta='" + numeroConta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito!");
            return false;
        }

        this.saldo += valor;
        System.out.println("Deposito realizado!");
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return false;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return false;
        }

        this.saldo -= valor;
        System.out.println("Saque realizado!");
        return true;
    }

    public boolean transferir(ContaBancaria destino, double valor) {
        if (destino == null) return false;

        if (this == destino) return false;

        if (valor <= 0) return false;

        if (!this.sacar(valor)) return false;

        destino.depositar(valor);
        System.out.println("Tranferência realizada!");
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public boolean setTitular(String titular) {
        if (titular == null) {
            return false;
        }

        this.titular = titular;
        return true;
    }

}