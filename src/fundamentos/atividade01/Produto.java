package fundamentos.atividade01;

public class Produto {
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

    //Métodos
    public void adicionarEstoque (int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Para adicionar ao estoque, o valor da quantidade não pode ser 0 ou menor");
            return;
        }
        this.estoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Para remover do estoque, o valor da quantidade não pode ser 0 ou menor");
            return;
        }

        if (quantidade > this.estoque) {
            System.out.println("Quantidade maior que o estoque, não é possivel fazer essa operação");
            return;
        }

        this.estoque -= quantidade;
    }

    public double calcularValorTotalEstoque() {
        return preco * estoque;
    }

    //Sobrecarga
    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual inválido: " + percentual);
            return;
        }

        double desconto = this.preco * (percentual / 100);
        this.preco -= desconto;
    }

    public void aplicarDesconto(double percentual, boolean percentualEmDecimal) {
        double valorPercentual;

        if (percentualEmDecimal) {
            if (percentual < 0 || percentual > 1) {
                return;
            }
            valorPercentual = percentual;
        } else {
            if (percentual < 0 || percentual > 100) {
                return;
            }
            valorPercentual = percentual / 100;
        }

        double desconto = this.preco * valorPercentual;
        this.preco -= desconto;
    }

}