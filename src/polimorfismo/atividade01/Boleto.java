package polimorfismo.atividade01;

public class Boleto implements Pagamento{
    private double taxaFixa = 5.00;
    private double valorMinimo = 10.00;

    @Override
    public boolean processar(double valor) {
        if (valor < valorMinimo) {
            return false;
        }
        double valorFinal = valor + taxaFixa;
        return true;
    }

    @Override
    public String getDescricao() {
        return "Boleto";
    }
}
