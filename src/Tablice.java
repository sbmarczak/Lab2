import java.util.Arrays; // wymagana biblioteka

public class Tablice {
    public static void main(String[] args) {
        /** TWORZENIE TABLICY i SORTOWANIE */
        // Tworzenie tablicy liczb całkowitych
        int[] liczby = {7, 3, 5, 1, 4, 9,};

        // Wyświetlenie tablicy przed sortowaniem
        System.out.println("Tablica przed sortowaniem: " + Arrays.toString(liczby));

        // Sortowanie tablicy
        Arrays.sort(liczby);

        // Wyświetlenie tablicy po sortowaniu
        System.out.println("Tablica po sortowaniu: " + Arrays.toString(liczby));
        // Liczby = [1, 3, 4, 5, 7, 9]

        /** KOPIOWANIE */
        // Kopiowanie całej tablicy
        int[] kopiaLiczby = Arrays.copyOf(liczby, liczby.length);

        // Wyświetlenie skopiowanej tablicy
        System.out.println("Skopiowana tablica: " + Arrays.toString(kopiaLiczby));

        /** KONWERTOWANIE TABLICY (na ciąg tekstowy) */
        // Konwersja tablicy do ciągu tekstowego
        String tekstowaTablica = Arrays.toString(liczby);

        // Wyświetlenie ciągu tekstowego reprezentującego tablicę
        System.out.println("Tablica w formie tekstowej: " + tekstowaTablica); // Konwersja tablicy do ciągu tekstowego

        /** PRZESZUKIWANIE TABLICY */
        // Przeszukiwanie tablicy w poszukiwaniu liczby 9
        int indeks = Arrays.binarySearch(liczby, 9);
        System.out.println("Indeks cyfry 9 w tablicy to " + indeks);
        // INDEKS o numerze 5

        /** PORÓWNYWANIE TABLIC */
        int[] tablicaA = {9, 5, 3};
        int[] tablicaB = {2, 5, 3};
        boolean czyRowne = Arrays.equals(tablicaA, tablicaB); // Porównanie tablic
        System.out.println("Czy tablice są równe? " + czyRowne);
        // FALSE

        /** WYPEŁNIENIE TABLICY */
        // Wypełnienie (zastąpienie) tablicy wartością 50
        Arrays.fill(liczby, 50);

        // Wyświetlenie tablicy po wypełnieniu
        System.out.println("Tablica po wypełnieniu: " + Arrays.toString(liczby));
    }
}

