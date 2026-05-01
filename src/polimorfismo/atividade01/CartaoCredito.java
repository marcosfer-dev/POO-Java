package polimorfismo.atividade01;

public class CartaoCredito implements Pagamento{
    private double taxa = 0.02;

    @Override
    public boolean processar(double valor) {
        if (valor <= 0) {
            return false;
        }
        double valorFinal = valor + (valor * taxa);
        return true;
    }

    @Override
    public String getDescricao() {
        return "Cartão de Crédito";
    }
}
