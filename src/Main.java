import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrada;
        double saldo = 2500, valorEntrada;
        String nome = "Marisol";
        String tipoConta = "Conta Corrente";
        String menu = """
                Operações

                1- Consultar Saldos
                2- Depositar Valor
                3- Sacar Valor
                4- Sair

                """;
        do{
            System.out.println(menu);
            entrada = scan.nextInt();

            switch (entrada){
                case 1:     // Caminho Consulta Saldo
                    System.out.printf("""
                            ************************************
                            
                            Dados iniciais do Cliente
                            Nome: %s
                            Tipo conta: %s
                            Saldo Inicial: R$ %.2f
                            
                            ************************************
                            """, nome, tipoConta, saldo);
                    break;
                case 2:     // Caminho Deposito Valor
                    System.out.println("Informe o valor que deseja Depositar.");
                    valorEntrada = scan.nextDouble();

                    if(valorEntrada < 0){
                        System.out.println("Insira um valor maior que zero.");
                    } else{
                        saldo += valorEntrada;
                        System.out.printf("Saldo atualizado R$ %.2f", saldo);
                    }
                    break;
                case 3:     // Caminho Saque Valor
                    System.out.println("Informe o valor que deseja Sacar");
                    valorEntrada = scan.nextDouble();

                    if(valorEntrada > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else if(valorEntrada < 0){
                        System.out.println("Insira um valor maior que zero.");
                    } else{
                        saldo -= valorEntrada;
                        System.out.printf("Saldo atualizado R$ %.2f", saldo);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Entrada inválida...");
                    break;
            }
        } while(entrada != 4);
        System.out.println("Fechando o programa...");
    }
}