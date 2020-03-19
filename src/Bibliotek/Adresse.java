package Bibliotek;

public class Adresse {
    int postnmr;
    String by;
    String Kortnavn;
    String Vasensnavn;
    String Adresse;
    double longitude;
    double latitude;

    public Adresse(int postnmr, String bynavn, String kortnavn, String vasensnavn, String adresse, double longitude, double latitude) {
        this.postnmr = postnmr;
        this.by = bynavn;
        Kortnavn = kortnavn;
        Vasensnavn = vasensnavn;
        Adresse = adresse;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return " " +
                "postnr=" + postnmr +
                ", by='" + by + '\'' +
                ", Kortnavn='" + Kortnavn + '\'' +
                ", Vasensnavn='" + Vasensnavn + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude;
    }
}
