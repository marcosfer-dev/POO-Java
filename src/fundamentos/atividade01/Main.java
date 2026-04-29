package fundamentos.atividade01;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto(1, "Computador", 3000.0, 500);
        p.exibirDetalhes();
        System.out.println("Valor total em estoque antes: " + p.calcularValorTotalEstoque());
        p.aplicarDesconto(10);
        p.exibirDetalhes();
        System.out.println("Valor total em estoque atualizado: " + p.calcularValorTotalEstoque());
        p.aplicarDesconto(20, false);
        p.exibirDetalhes();

    }
}
