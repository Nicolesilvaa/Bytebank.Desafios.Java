package br.com.bytebank.desafio1.app;

import br.com.bytebank.desafio1.model.Cliente;
import br.com.bytebank.desafio1.model.Conta;
import br.com.bytebank.desafio1.service.contaServico;
import br.com.bytebank.desafio1.utils.TipoConta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        contaServico servico = new contaServico();

        int opcao;

        do {
            System.out.println("\n----------------- MENU BYTEBANK ---------------");
            System.out.println("1. Criar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Ver dados da conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n---------- Criar Conta -------------");
                    System.out.print("Nome completo: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Tipo de cliente (ex: Pessoa Física): ");
                    String tipoCliente = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, cpf, email, tipoCliente);

                    System.out.print("Saldo inicial: ");
                    double saldo = scanner.nextDouble();

                    System.out.println("\nTipo da conta:");
                    System.out.println("1 - CORRENTE");
                    System.out.println("2 - POUPANCA");
                    System.out.println("3 - SALARIO");
                    System.out.println("4 - INVESTIMENTO");
                    System.out.print("Escolha a opção: ");

                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // limpar buffer

                    TipoConta tipoConta;
                    switch (tipo) {
                        case 1:
                            tipoConta = TipoConta.CORRENTE;
                            break;

                        case 2:
                            tipoConta = TipoConta.POUPANCA;
                            break;

                        case 3:
                            tipoConta = TipoConta.SALARIO;
                            break;

                        case 4:
                            tipoConta = TipoConta.INVESTIMENTO;
                            break;
                        default:
                            System.out.println("Tipo inválido, selecionando CORRENTE por padrão.");
                            tipoConta = TipoConta.CORRENTE;
                    }

                    Conta novaConta = new Conta(saldo, cliente, tipoConta);
                    boolean criada = servico.criarConta(novaConta);

                    if (criada) {
                        System.out.println("\nConta criada com sucesso!");
                        System.out.println(novaConta);

                    } else {
                        System.out.println("\nJá existe uma conta com esse número.");
                    }

                    break;

                case 2:
                    System.out.println("\n------------ Depositar -------------");

                    System.out.print("Número da conta para depósito: ");
                    long numeroDep = scanner.nextLong();

                    System.out.print("Valor do depósito: ");
                    double valorDep = scanner.nextDouble();

                    boolean deposito = servico.depositar(numeroDep, valorDep);
                    if(deposito){
                        System.out.printf("Depósito de R$ %.2f realizado com sucesso na conta %d.%n\", valorDep, numeroDep)");
                    }
                    else{
                        System.out.println("Depósito falhou. Verifique o número da conta ou valor.");
                    }

                    break;

                case 3:
                    System.out.println("\n--- Sacar ---");

                    System.out.print("Número da conta para saque: ");
                    long numeroSaque = scanner.nextLong();

                    System.out.print("Valor do saque: ");
                    double valorSaque = scanner.nextDouble();

                    boolean sacar = servico.sacar(numeroSaque, valorSaque);
                    if(sacar){
                        System.out.printf("Saque de R$ %.2f realizado com sucesso na conta %d.%n\", numeroSaque, valorSaque)");
                    }
                    else{
                        System.out.println("Saque não realizado. Verifique o saldo ou número da conta.");
                    }

                    break;

                case 4:
                    System.out.println("\n---------- Transferência -----------");

                    System.out.print("Número da conta de origem: ");
                    long origem = scanner.nextLong();
                    System.out.print("Número da conta de destino: ");

                    long destino = scanner.nextLong();
                    System.out.print("Valor da transferência: ");
                    double valor = scanner.nextDouble();

                    boolean transferencia = servico.transferir(origem, destino, valor);
                    if(transferencia) {
                        System.out.printf("Transferência de R$ %.2f da conta %d para a conta %d realizada com sucesso.%n", valor, origem, destino);
                    }
                    else {
                        System.out.println("Falha na transferência. Verifique o saldo ou os números das contas.");
                    }

                    break;

                case 5:
                    System.out.println("\n-------- Dados da Conta -------------");

                    System.out.print("Número da conta: ");
                    long numeroConsulta = scanner.nextLong();

                    Conta conta = servico.buscarConta(numeroConsulta);

                    if (conta != null) {
                        System.out.println(conta);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
