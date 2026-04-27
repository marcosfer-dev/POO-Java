package fundamentos.atividade01;

public class Produto {
    //Fundamentos: classes, atributos, métodos, construtor, this.

    //Atributos
    private int id;
    private String nome;
    private double preco;
    private int estoque;

    //Construtor
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public Produto(int id, String nome, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirDetalhes() {
        System.out.println("Dados do Produto" +
                            "\nID: " + this.id +
                            "\nNome: " + this.nome +
                            "\nPreço: " + this.preco +
                            "\nEstoque: " + this.estoque);
        System.out.println("----------------------------");
    }

    public void adicionarEstoque (int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Para adicionar ao estoque, o valor da quantidade não pode ser 0 ou menor");
        }
        this.estoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Para remover do estoque, o valor da quantidade não pode ser 0 ou menor");
        }

        if (quantidade > this.estoque) {
            System.out.println("Quantidade maior que o estoque, não é possivel fazer essa operação");
        }

        this.estoque -= quantidade;
    }

    public double calcularValorTotalEstoque() {
        return preco * estoque;
    }

}
