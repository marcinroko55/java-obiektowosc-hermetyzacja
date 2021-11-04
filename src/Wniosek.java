public class Wniosek {
    private String imieINazwisko;
    private String typTablicy;
    private String status = "Złożono";
    private int numer;

    public Wniosek(String imieINazwisko, String typTablicy, int numer) {
        this.imieINazwisko = imieINazwisko;
        this.typTablicy = typTablicy;
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void display() {
        System.out.println("I i M: " + imieINazwisko);
        System.out.println("Typ tablicy: " + typTablicy);
        System.out.println("Status: " + status);
        System.out.println("Numer wniosku: " + numer);
    }
}
