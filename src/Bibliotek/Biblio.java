package Bibliotek;

public class Biblio {
    int postnr;
    String by;
    String kortNavn;
    String væsensnavn;
    String adresse;
    double latitude;
    String biblioType;
    int id;
    double longitude;
    String navn;

    public Biblio(int postnr, String by, String kortNavn, String væsensnavn, String adresse, double latitude, String biblioType, int id, double longitude, String navn) {
        this.postnr = postnr;
        this.by = by;
        this.kortNavn = kortNavn;
        this.væsensnavn = væsensnavn;
        this.adresse = adresse;
        this.latitude = latitude;
        this.biblioType = biblioType;
        this.id = id;
        this.longitude = longitude;
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "bibliotek: " +
                "postnr " + postnr +
                ", by '" + by + '\'' +
                ", kortNavn '" + kortNavn + '\'' +
                ", væsensnavn '" + væsensnavn + '\'' +
                ", adresse '" + adresse + '\'' +
                ", latitude " + latitude +
                ", biblioType '" + biblioType + '\'' +
                ", id " + id +
                ", longitude " + longitude +
                ", navn '" + navn + "'"+"\n";
    }

    public int getPostnr() {
        return postnr;
    }

    public String getBy() {
        return by;
    }

    public String getKortNavn() {
        return kortNavn;
    }

    public String getVæsensnavn() {
        return væsensnavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getBiblioType() {
        return biblioType;
    }

    public int getId() {
        return id;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getNavn() {
        return navn;
    }
}
