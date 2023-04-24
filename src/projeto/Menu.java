package projeto;

/**
* @author Sabrina Miranda
*/

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    
    public void mostrarMenu() {
        CadastroCidadao cadastroCidadao = new CadastroCidadao();
        int opcao;
        
        do {
            System.out.println("\n------------------- Menu -------------------");
            System.out.println("\n Escolha uma das opões:\n");
            System.out.println(" 1. Vacinar Cidadão");
            System.out.println(" 2. Listar Cidadãos Vacinados");
            System.out.println(" 3. Sair");
            System.out.println("\n--------------------------------------------\n");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
    
            switch(opcao) {
                case 1:
                    cadastroCidadao.lerDadosCidadao();
                    break;
                case 2:
                cadastroCidadao.listaCidadaosVacinados();
                    break;
                case 3:
                    System.out.println("Saindo..");
                    break;  
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 3);
    }
}
