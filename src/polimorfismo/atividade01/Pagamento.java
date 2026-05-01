package polimorfismo.atividade01;

public interface Pagamento {
    boolean processar(double valor);
    String getDescricao();
}
