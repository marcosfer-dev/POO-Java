package polimorfismo.atividade01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        //Pagamentos Válidos
        processador.executar(new CartaoCredito(), 100);
        processador.executar(new Boleto(), 50);
        processador.executar(new Pix(), 200);

        System.out.println(" ");

        //Pagamentos Inválidos
        processador.executar(new Boleto(), 5);
        processador.executar(new Pix(), -10);
        processador.executar(new CartaoCredito(), 0);

        System.out.println("\nLista de Arrays");
        List<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new CartaoCredito());
        pagamentos.add(new Boleto());
        pagamentos.add(new Pix());

        for (Pagamento pagamento : pagamentos) {
            processador.executar(pagamento, 100);
        }
    }
}