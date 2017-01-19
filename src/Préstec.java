
public class Préstec {

    private String llibre;
    private String soci;
    private String data_inici;
    private String data_final;

    public Préstec() {}

    public Préstec(String llibre, String soci, String data_inici, String data_final) {
        this.llibre = llibre;
        this.soci = soci;
        this.data_inici = data_inici;
        this.data_final = data_final;
    }

    public String getLlibre() {
        return llibre;
    }

    public void setLlibre(String llibre) {
        this.llibre = llibre;
    }

    public String getSoci() {
        return soci;
    }

    public void setSoci(String soci) {
        this.soci = soci;
    }

    public String getData_inici() {
        return data_inici;
    }

    public void setData_inici(String data_inici) {
        this.data_inici = data_inici;
    }

    public String getData_final() {
        return data_final;
    }

    public void setData_final(String data_final) {
        this.data_final = data_final;
    }
}
