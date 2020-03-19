package Bibliotek;

public class Biblio {
    String væsensnavn;
    String biblioType;
    int id;
    String navn;
    Adresse adresse;

    public Biblio(String væsensnavn, String biblioType, int id, String navn) {
        this.væsensnavn = væsensnavn;
        this.biblioType = biblioType;
        this.id = id;
        this.navn = navn;

    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Biblio{" +
                "væsensnavn='" + væsensnavn + '\'' +
                ", biblioType='" + biblioType + '\'' +
                ", id=" + id +
                ", navn='" + navn + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
