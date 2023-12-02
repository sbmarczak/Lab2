// Klasa Film z podstawowymi informacjami o nim
public class Film {
    // Prywatne pola klasy przechowujące informacje o filmie
    private String tytul; // Tytuł filmu
    private String rezyser; // Imię i nazwisko reżysera filmu
    private String gatunek; // Gatunek filmu
    private int ocena; // Ocena filmu (w skali od 1 do 10)
    private String aktor; // Główny aktor filmu
    private int rokProdukcji; // Rok produkcji filmu

    // Konstruktor klasy Film, który inicjalizuje nowy obiekt z podanymi wartościami
    public Film(String tytul, String rezyser, String gatunek, int rokProdukcji) {
        this.tytul = tytul;
        this.rezyser = rezyser;
        this.gatunek = gatunek;
        this.rokProdukcji = rokProdukcji;
        this.ocena = 0; // Domyślna wartość oceny to 0
        this.aktor = ""; // Domyślna wartość aktora to pusty ciąg
    }

    // Metoda do ustawiania oceny filmu
    public void ustawOcene(int ocena) {
        this.ocena = ocena;
    }

    // Metoda do ustawiania głównego aktora filmu
    public void ustawAktora(String aktor) {
        this.aktor = aktor;
    }

    // Gettery i settery pozwalają na dostęp i modyfikację prywatnych pól klasy
    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getRezyser() {
        return rezyser;
    }

    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getOcena() { // Poprawiona metoda
        return ocena;
    }

    public String getAktor() { // Poprawiona metoda
        return aktor;
    }

    // Metoda wyswietlInformacje wyświetla wszystkie informacje o filmie
    public void wyswietlInformacje() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Reżyser: " + rezyser);
        System.out.println("Gatunek: " + gatunek);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Aktor: " + aktor);
        System.out.println("Ocena: " + ocena);
    }
    // Główna metoda programu (main), która tworzy obiekty klasy film i wywołuje ich metody
    public static void main(String[] args) {
        Film film1 = new Film("FilmJeden", "Rezyser1", "Gatunek1", 2014);
        film1.ustawOcene(9);
        film1.ustawAktora("Aktor1");
        film1.wyswietlInformacje();
        Film film2 = new Film("FilmDwa", "Rezyser2", "Gatunek2", 2022);
        film2.ustawOcene(2);
        film2.ustawAktora("Aktor2");
        film2.wyswietlInformacje();

    }
}
