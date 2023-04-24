package projeto;

/**
* @author Sabrina Miranda
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataVacina {

    public static int intervaloDatas(String data1, String data2) {
        
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate primeiraData = LocalDate.parse(data1, formatoData);
        LocalDate segundaData = LocalDate.parse(data2, formatoData);

        primeiraData.compareTo(segundaData);
        long intervalo = ChronoUnit.MONTHS.between(primeiraData, segundaData);

        return (int) intervalo;
    }
}
