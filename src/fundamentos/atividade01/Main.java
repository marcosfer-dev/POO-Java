package fundamentos.atividade01;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto(1, "Computador", 3000.0, 500);
        p.exibirDetalhes();
        System.out.println("Valor total em estoque antes: " + p.calcularValorTotalEstoque());
        p.adicionarEstoque(500);
        p.removerEstoque(100);
        p.exibirDetalhes();
        System.out.println("Valor total em estoque atualizado: " + p.calcularValorTotalEstoque());
    }
}
