package encapsulamento.atividade01;

public class Main {
    public static void main(String[] args) {
        // 1) Criação de contas
        ContaBancaria conta1 = new ContaBancaria("123", "Marcos");
        ContaBancaria conta2 = new ContaBancaria("456", "Ana");

        System.out.println("=== Contas criadas ===");
        System.out.println(conta1);
        System.out.println(conta2);

        // 2) Depósitos
        System.out.println("\n=== Depósitos ===");
        conta1.depositar(1000);   // válido
        conta1.depositar(-50);    // inválido

        // 3) Saques
        System.out.println("\n=== Saques ===");
        conta1.sacar(200);        // válido
        conta1.sacar(10000);      // inválido (saldo insuficiente)
        conta1.sacar(-10);        // inválido

        // 4) Transferência
        System.out.println("\n=== Transferência ===");
        conta1.transferir(conta2, 300);   // válida
        conta1.transferir(conta2, -50);   // inválida
        conta1.transferir(conta1, 100);   // inválida (mesma conta)

        // 5) Alteração de titular
        System.out.println("\n=== Alterar titular ===");
        boolean alterou = conta1.setTitular("Novo Nome");
        System.out.println("Alterou titular? " + alterou);

        boolean alterouInvalido = conta1.setTitular(null);
        System.out.println("Alterou titular inválido? " + alterouInvalido);

        // 6) Estado final
        System.out.println("\n=== Estado final ===");
        System.out.println(conta1);
        System.out.println(conta2);
    }
}
