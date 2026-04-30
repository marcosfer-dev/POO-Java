package heranca.atividade01;

public class Main {
    public static void main(String[] args) {
        //Herança
        Funcionario f = new Funcionario("João", 3000);
        Gerente g = new Gerente("Maria", 5000);
        Desenvolvedor d = new Desenvolvedor("Marcos", 4000, "Java");

        System.out.println("Funcionário\n" + f.getDados());
        System.out.println(" ");
        System.out.println("Gerente\n" + g.getDados());
        g.aprovarOrcamento(10000);
        System.out.println(" ");
        System.out.println("Desenvolvedor\n" + d.getDados());
        d.programar();
        System.out.println(" ");
    }
}
