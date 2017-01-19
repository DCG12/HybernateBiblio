
public class Socis {

    private String nom;
    private String cognom;
    private int edat;
    private String direccio;
    private int telefon;

    public Socis() {}

    public Socis(String nom, String cognom, int edat, String direccio, int telefon) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.direccio = direccio;
        this.telefon = telefon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
}
