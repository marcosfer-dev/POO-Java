package heranca.atividade01;

public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);

        if (linguagem == null || linguagem.isBlank()) {
            throw new IllegalArgumentException("Linguagem inválida");
        }

        this.linguagem = linguagem;
    }
    @Override
    public double calcularBonus() {
        return getSalario() * 0.10;
    }

    public void programar() {
        System.out.println("Programando em " + this.linguagem);
    }

    public String getLinguagem() {
        return linguagem;
    }
}