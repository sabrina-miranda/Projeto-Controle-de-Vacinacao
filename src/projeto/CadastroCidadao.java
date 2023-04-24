package projeto;

/**
* @author Sabrina Miranda
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CadastroCidadao {
    Scanner scanner = new Scanner(System.in);
    List<Cidadao> listaCidadaos = new ArrayList<>();

    public void mostrarMensagem() {
        System.out.println("\n Você ainda não tem direito a uma nova data.");
        System.out.println(" O intervalo entre as doses deve ser de no mínimo 4 meses.");
    }
    
    public boolean lerDadosCidadao() {
        int intervaloDoses;
        Cidadao cidadao  = new Cidadao();
        
        System.out.println("\n Informe o CPF do cidadão:");
        cidadao.setCpf(scanner.nextLine());
        
        System.out.println("\n Informe o nome do cidadão:");
        cidadao.setNome(scanner.nextLine());
    
        System.out.println("\n Informe as datas de vacinação (dia/mês/ano):");
    
        System.out.println("\n -> 1ª dose:");
        cidadao.setDataPrimeiraDose(scanner.nextLine());
    
        System.out.println("\n -> 2ª dose:");
        cidadao.setDataSegundaDose(scanner.nextLine());
    
        intervaloDoses = DataVacina.intervaloDatas(cidadao.getDataPrimeiraDose(), cidadao.getDataSegundaDose());
        if (intervaloDoses < 4) {
            mostrarMensagem();
            return false;
        }
    
        System.out.println("\n -> 3ª dose:");
        cidadao.setDataTerceiraDose(scanner.nextLine());
    
       intervaloDoses = DataVacina.intervaloDatas(cidadao.getDataSegundaDose(), cidadao.getDataTerceiraDose());
        if (intervaloDoses < 4) {
            mostrarMensagem();
            return false;
        }
    
        System.out.println("\n -> 4ª dose:");
        cidadao.setDataQuartaDose(scanner.nextLine());
    
        intervaloDoses = DataVacina.intervaloDatas(cidadao.getDataTerceiraDose(), cidadao.getDataQuartaDose());
        if (intervaloDoses < 4) {
            mostrarMensagem();
            return false;
        }
    
        listaCidadaos.add(cidadao);
        System.out.println("\n CADASTRO REALIZADO com sucesso!");
        return true;
    }

    public void listaCidadaosVacinados() {
        System.out.println("\n >>> Lista de Cidadãos Vacinados <<<");
        for(int i = 0; i < listaCidadaos.size(); i++) {
            System.out.println("\n Nome: " + listaCidadaos.get(i).getNome());
            System.out.println(" CPF: " + listaCidadaos.get(i).getCpf());
            System.out.println(" Data da 1° Dose: " + listaCidadaos.get(i).getDataPrimeiraDose());
            System.out.println(" Data da 2° Dose: " + listaCidadaos.get(i).getDataSegundaDose());
            System.out.println(" Data da 3° Dose: " + listaCidadaos.get(i).getDataTerceiraDose());
            System.out.println(" Data da 4° Dose: " + listaCidadaos.get(i).getDataQuartaDose());
        }
    }
}
