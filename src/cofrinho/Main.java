package cofrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        
        while (true) {
            System.out.println("**********MENU**********");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("5 - Sair");
            System.out.println("************************");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo de moeda (1 - Dólar, 2 - Euro, 3 - Real): ");
                    int tipo = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();
                    
                    Moeda novaMoeda = null;
                    if (tipo == 1) novaMoeda = new Dolar(valor);
                    else if (tipo == 2) novaMoeda = new Euro(valor);
                    else if (tipo == 3) novaMoeda = new Real(valor);
                    
                    if (novaMoeda != null) cofrinho.adicionar(novaMoeda);
                    else System.out.println("Opção inválida!");
                    break;
                
                case 2:
                    if (cofrinho.totalConvertido() == 0) {
                        System.out.println("O cofrinho está vazio. Nada para remover.");
                        break;
                    }
                    
                    cofrinho.listagemMoedas();
                    System.out.print("Digite o número da moeda que deseja remover: ");
                    int index = scanner.nextInt() - 1;
                    cofrinho.remover(index);
                    break;
                
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                
                case 4:
                    System.out.println("Total convertido para Real: R$" + cofrinho.totalConvertido());
                    break;
                
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
