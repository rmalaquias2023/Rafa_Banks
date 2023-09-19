import java.util.Scanner;

public class RafaBanks {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeCliente = "Rafael Malaquias";
        double saldoConta = 0;
        double saldoPoupanca = 0;
        int opcao = 0;


        while (opcao != 8) {
            System.out.println("*************************************");
            System.out.println("**** Seja Bem Vindo ao RafaBanks ****");
            System.out.println("*************************************");

            System.out.println(" Nome do cliente: " + nomeCliente);
            System.out.println(String.format(" Saldo atual na conta.: R$ %.2f ", saldoConta));
            System.out.println(String.format(" Saldo atual na Poupança.: R$ %.2f ", saldoPoupanca));

            System.out.println("*************************************");
            System.out.println("**************** MENU ***************");
            System.out.println(" 1 - Ver saldo Conta Corrente");
            System.out.println(" 2 - Ver saldo Conta Poupança");
            System.out.println(" 3 - Transferir dinheiro da conta corrente para conta poupança ");
            System.out.println(" 4 - Resgatar dinheiro da poupança");
            System.out.println(" 5 - PIX ");
            System.out.println(" 6 - Sacar um valor");
            System.out.println(" 7 - Depósito");
            System.out.println(" 8 - Sair");
            System.out.println("*************************************");
            System.out.println("Qual a opção desejada? ");
            opcao = leitura.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println(String.format("Saldo total da conta corrente de.: R$ %.2f ", saldoConta));
                    System.out.println("Deseja mais alguma coisa? 1 - sim ou 2 - não");
                    int opcaoIntermediaria1 = leitura.nextInt();
                    if (opcaoIntermediaria1 == 2) {
                        break;
                    }
                case 2:
                    System.out.println(String.format("Saldo total da conta poupança de .: R$ %.2f ", saldoPoupanca));
                    System.out.println("Deseja mais alguma coisa? 1 - sim ou 2 - não");
                    int opcaoIntermediaria2 = leitura.nextInt();
                    if (opcaoIntermediaria2 == 2) {
                        break;
                    }

                case 3:
                    System.out.println("Digite o valor a ser transferido para sua C/P: ");
                    double valorTransferencia = leitura.nextDouble();
                    if (valorTransferencia < saldoConta) {
                        saldoConta = saldoConta - valorTransferencia;
                        saldoPoupanca = saldoPoupanca + valorTransferencia;
                        System.out.println(String.format("Saldo da sua C/C passou .: R$ %.2f ", saldoConta));
                        System.out.println(String.format("Saldo da sua C/P passou .: R$ %.2f ", saldoPoupanca));
                    } else {
                        System.out.println("Valor acima do saldo disponível");
                        break;
                    }
                    System.out.println("Deseja mais alguma coisa? 1 - sim ou 2 - não");
                    int opcaoIntermediaria3 = leitura.nextInt();
                    if (opcaoIntermediaria3 == 2) {
                        break;
                    }

                case 4:
                    if (saldoPoupanca > 0) {
                        System.out.println("Digite o valor a ser resgatado para sua C/C: ");
                        double valorTransferenciaPoupanca = leitura.nextDouble();
                        if (valorTransferenciaPoupanca < saldoPoupanca) {
                            saldoConta = saldoConta + valorTransferenciaPoupanca;
                            saldoPoupanca = saldoPoupanca - valorTransferenciaPoupanca;
                            System.out.println(String.format("Saldo da sua C/C passou .: R$ %.2f ", saldoConta));
                            System.out.println(String.format("Saldo da sua C/P passou .: R$ %.2f ", saldoPoupanca));
                        } else {
                            System.out.println("Valor acima do saldo disponível");
                        }
                    } else {
                        System.out.println("Não foi possivel realizar esta operação. Saldo insuficiente");
                    }
                    System.out.println("Deseja mais alguma coisa? 1 - sim ou 2 - não");
                    int opcaoIntermediaria4 = leitura.nextInt();
                    if (opcaoIntermediaria4 == 2) {
                        break;
                    }
                case 5:
                    System.out.println("Para maior segurança, você só poderá realizar PIX da sua C/C");
                    System.out.println("Digite a chave PIX? ");
                    String chavePix = leitura.next();
                    System.out.println("Digite o valor?");
                    double valorTransferenciaConta = leitura.nextDouble();
                    if (saldoConta >= valorTransferenciaConta) {
                        System.out.println("Confirme os dados por favor!");
                        System.out.println("Transferência via PIX para a chave: " + chavePix);
                        System.out.println(String.format("Na Importancia de .: R$ %.2f ", valorTransferenciaConta));
                        System.out.println("Você confirma a transação? 1 - Sim, 2 - Não");
                        int opcaoIntermediaria5 = leitura.nextInt();
                        if (opcaoIntermediaria5 == 1) {
                            saldoConta = saldoConta - valorTransferenciaConta;
                            System.out.println(String.format("Saldo na conta corrente de : R$ %.2f", saldoConta));
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("Saldo disponível insuficiente!");
                    }
                    System.out.println("Deseja mais alguma coisa? 1 - sim ou 2 - não");
                    int opcaoIntermediaria6 = leitura.nextInt();
                    if (opcaoIntermediaria6 == 2) {
                        break;
                    }

                case 6:
                    System.out.println("Para maior segurança, você só poderá realizar SAQUE da sua C/C");
                    System.out.println("Digite o valor a ser sacado? ");
                    double valorSaque = leitura.nextDouble();
                    if (valorSaque < saldoConta && saldoConta > 0) {
                        System.out.println("Confirme os dados por favor!");
                        System.out.println(String.format("Saque na importancia de .: R$ %.2f ", valorSaque));
                        System.out.println("Você confirma a transação? 1 - Sim, 2 - Não");
                        int opcaoIntermediaria7 = leitura.nextInt();
                        if (opcaoIntermediaria7 == 1) {
                            saldoConta = saldoConta - valorSaque;
                            System.out.println("Dinheiro disponível no bocal do caixa eletrônico!!");
                            System.out.println(String.format("Saldo disponivel em conta: R$.%2", saldoConta));
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("Saldo disponível insuficiente!");
                    }
                    System.out.println("Deseja mais alguma coisa? 1 - sim ou 2 - não");
                    int opcaoIntermediaria8 = leitura.nextInt();
                    if (opcaoIntermediaria8 == 2) {
                        break;
                    }
                case 7:
                    System.out.println("Digite o valor a ser depositado!! ");
                    double valorDeposito = leitura.nextDouble();
                    System.out.println("Só um momento!");
                    saldoConta = saldoConta + valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println(String.format("Após a transferência o saldo da sua C/C passou .: R$ %.2f ", saldoConta));
                    System.out.println("Deseja mais alguma coisa? 1 - sim ou 2 - não");
                    int opcaoIntermediaria9 = leitura.nextInt();
                    if (opcaoIntermediaria9 == 2) {
                        break;
                    }
                case 8:
                    System.out.println("Foi um prazer em ajuda-lo!!");
                    break;
            }

        }


    }
}






