package polimorfismo.atividade01;

public class ProcessadorPagamento {
    public void executar(Pagamento pagamento, double valor) {
        boolean sucesso = pagamento.processar(valor);

        if (sucesso) {
            System.out.println("Pagamento aprovado: " + pagamento.getDescricao());
        } else {
            System.out.println("Pagamento recusado: " + pagamento.getDescricao());
        }
    }
}
