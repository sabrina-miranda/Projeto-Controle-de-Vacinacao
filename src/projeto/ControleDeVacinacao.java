package projeto;

/**
* @author Sabrina Miranda
*/

public class ControleDeVacinacao {
    public static void main(String[] args) {
        System.out.println("\n----- Sistema De Controle De Vacinação -----");
        Enfermeira enfermeira = new Enfermeira();
        enfermeira.lerDadosEnfermeira();

        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}
