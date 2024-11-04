import java.util.Scanner;

public class Dasafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 2500.00;
        int escolha = 0;

        System.out.println("""
                ***************************
                Dados iniciais do cliente:
                
                Nome: Giovanni
                Tipo de conta: Corrente
                Saldo inicial: R$ """ + saldo +
                """
                
                **************************""");

        while (escolha != 4){
            System.out.println("Operações");
            System.out.println(" ");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println(" ");
            System.out.print("Digite a opção desejada: ");
            escolha = leitor.nextInt();

            if (escolha == 1){
                System.out.println("Osaldo atual é de R$ " + saldo);
            } else if (escolha == 2){
                System.out.println("Digite o valor a receber");
                double valor = leitor.nextDouble();
                saldo += valor;
                System.out.println("O saldo atualizado é de R$ " + saldo);
            } else if (escolha == 3) {
                System.out.println("Digite o valor a ser trasnferido");
                double valor = leitor.nextDouble();
                if (saldo < valor){
                    System.out.println("Saldo insulficiente.");
                } else {
                    saldo -= valor;
                    System.out.println("O saldo atualizado é de R$ " + saldo);
                }
            } else if (escolha == 4) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

