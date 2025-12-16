import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        String nome = "Arthur Morgan";
        String tipoConta = "Corrente";
        double saldo = 2200.60;
        int opcao = 0;

        System.out.println("-------------------------------------------------\n");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n-------------------------------------------------\n");

        String menu = """
                * ---------- MENU ---------- *
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Finalizar atendimento
                """;


        Scanner ler = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();

            // CONSULTAR SALDO
            if (opcao == 1) {
                System.out.println("Saldo atualizado R$: " + saldo);
            }
            // TRANSFERIR VALOR
            else if (opcao == 2) {
                System.out.println("Digite o valor que será transferido:  ");
                double valorTransferido = ler.nextDouble();
                if (valorTransferido <= saldo) {
                System.out.println("Transferência de R$" + valorTransferido + " realizada. Saldo atualizado para: R$" + (saldo-valorTransferido));
                } else if (valorTransferido > saldo) {
                    System.out.println("Saldo insuficiente para transação.");
                }
            }
            // RECEBER VALOR
            else if (opcao == 3) {
                System.out.println("Digite o valor recebido.");
                double valorRecebido =  ler.nextDouble();
                System.out.println("Você recebeu o valor: R$" + valorRecebido + ". Saldo atualizado para:" + (saldo+valorRecebido));
            }
            // FINALIZAR ATENDIMENTO ou INVÁLIDO
            else if (opcao != 4) {
                System.out.println("Opção inválida.");
            }
        }
    }
}
