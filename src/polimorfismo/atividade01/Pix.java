package polimorfismo.atividade01;

public class Pix implements Pagamento{
    @Override
    public boolean processar(double valor) {
        return valor > 0;
    }

    @Override
    public String getDescricao() {
        return "Pix";
    }
}
