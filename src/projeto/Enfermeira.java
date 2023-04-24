package projeto;

/**
* @author Sabrina Miranda
*/

import java.util.Scanner;

public class Enfermeira extends Pessoa {
    Scanner scanner= new Scanner(System.in);
    
    public void lerDadosEnfermeira() {
        Enfermeira enfermeira = new Enfermeira();

        System.out.println("\n Informe o CPF da(o) enfermeira(o):");
        enfermeira.setCpf(scanner.nextLine());

        System.out.println("\n Informe o nome da(o) enfermeira(o):");
        enfermeira.setNome(scanner.nextLine());

        System.out.println("\n >>> " + enfermeira.getNome() + ", Seja Bem Vindo(a) ao sistema de vacinação! <<<");
    }
}
