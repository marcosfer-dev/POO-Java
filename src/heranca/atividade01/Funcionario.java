package heranca.atividade01;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        if (salario < 0) {
            throw new IllegalArgumentException("Salário inválido");
        }

        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.05;
    }

    public String getDados() {
        return "Nome: " + this.nome +
                "\nSalário: " + this.salario +
                "\nBônus: " + calcularBonus();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}