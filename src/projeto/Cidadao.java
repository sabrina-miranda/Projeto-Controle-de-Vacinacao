package projeto;

/**
* @author Sabrina Miranda
*/

public class Cidadao extends Pessoa{

    private String dataPrimeiraDose;
    private String dataSegundaDose;
    private String dataTerceiraDose;
    private String dataQuartaDose;
    
    public String getDataPrimeiraDose() {
        return dataPrimeiraDose;
    }
    
    public void setDataPrimeiraDose(String dataPrimeiraDose) {
        this.dataPrimeiraDose = dataPrimeiraDose;
    }
    
    public String getDataSegundaDose() {
        return dataSegundaDose;
    }
    
    public void setDataSegundaDose(String dataSegundaDose) {
        this.dataSegundaDose = dataSegundaDose;
    }
    
    public String getDataTerceiraDose() {
        return dataTerceiraDose;
    }
    
    public void setDataTerceiraDose(String dataTerceiraDose) {
        this.dataTerceiraDose = dataTerceiraDose;
    }
    
    public String getDataQuartaDose() {
        return dataQuartaDose;
    }
    
    public void setDataQuartaDose(String dataQuartaDose) {
        this.dataQuartaDose = dataQuartaDose;
    }
}
