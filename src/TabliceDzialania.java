import java.util.Arrays; // potrzebna biblioteka do działania na tablicach

public class TabliceDzialania {
    public static void main(String[] args) {
        /** 1. SUMA ELEMENTOW TABLIC */
        // Deklaracja i inicjalizacja dwóch tablic z liczbami
        int[] tablicaPierwsza = {1, 2, 3, 4, 5};
        int[] tablicaDruga = {6, 7, 8, 9, 10};

        // Obliczenie sumy wszystkich elementów w tablicy 1
        int sumaTablicaPierwsza = Arrays.stream(tablicaPierwsza).sum();

        // Obliczenie sumy wszystkich elementów w tablicy 2
        int sumaTablicaDruga = Arrays.stream(tablicaDruga).sum();

        // Wyświetlenie sumy wszystkich elementów dla obu tablic
        System.out.println("Suma wszystkich elementów w tablicy 1: " + sumaTablicaPierwsza);
        // 1+2+3+4+5=15
        System.out.println("Suma wszystkich elementów w tablicy 2: " + sumaTablicaDruga);
        // 6+7+8+9+10=45

        /** 2. MAX i MIN WARTOŚĆ ELEMENTÓW TABLIC */
        // Znalezienie maksymalnej i minimalnej wartości dla tablic
        int maxTablicaPierwsza = Arrays.stream(tablicaPierwsza).max().getAsInt();
        int minTablicaPierwsza = Arrays.stream(tablicaPierwsza).min().getAsInt();

        int maxTablicaDruga = Arrays.stream(tablicaDruga).max().getAsInt();
        int minTablicaDruga = Arrays.stream(tablicaDruga).min().getAsInt();

        // Wyświetlenie maksymalnych i minimalnych wartości dla obu tablic
        System.out.println("Maksymalna wartość w tablicy 1: " + maxTablicaPierwsza);
        System.out.println("Minimalna wartość w tablicy 1: " + minTablicaPierwsza);
        System.out.println("Maksymalna wartość w tablicy 2: " + maxTablicaDruga);
        System.out.println("Minimalna wartość w tablicy 2: " + minTablicaDruga);

        /** 3. ŚREDNIA WSZYSTKICH WARTOŚCI TABLIC */
        // Obliczenie średniej wartości dla tablicy 1
        double sredniaTablicaPierwsza = Arrays.stream(tablicaPierwsza).average().orElse(0);

        // Obliczenie średniej wartości dla tablicy 2
        double sredniaTablicaDruga = Arrays.stream(tablicaDruga).average().orElse(0);

        // Wyświetlenie średnich wartości dla obu tablic
        System.out.println("Średnia wszystkich wartości w tablicy 1: " + sredniaTablicaPierwsza);
        System.out.println("Średnia wszystkich wartości w tablicy 2: " + sredniaTablicaDruga);

        /** 4. KOPIA ISTNIEJĄCEJ TABLICY */
        //int[] tablicaPierwsza = {1, 2, 3, 4, 5};

        // Kopiowanie istniejącej tablicy do nowej tablicy
        int[] kopiaTablicy = Arrays.copyOf(tablicaPierwsza, tablicaPierwsza.length);

        // Wyświetlenie oryginalnej tablicy i jej kopii
        System.out.println("Oryginalna tablica: " + Arrays.toString(tablicaPierwsza));
        System.out.println("Kopia tablicy: " + Arrays.toString(kopiaTablicy));

        /** 5. OKRESLONE KRYTERIA (liczby wieksze od 3) */
        //int[] tablicaPierwsza = {1, 2, 3, 4, 5};
        // Określenie kryterium - liczby większe od 3
        int kryterium = 3;

        // Wybranie elementów spełniających kryterium i utworzenie nowej tablicy
        int[] nowaTablica = Arrays.stream(tablicaPierwsza)
                .filter(x -> x > kryterium)
                .toArray();

        // Wyświetlenie nowej tablicy
        System.out.println("Nowa tablica z elementami większymi od " + kryterium + ": "
                + Arrays.toString(nowaTablica));

        /** 6. USUNIECIE ELEMENTU Z TABLICY */
        //int[] tablicaPierwsza = {1, 2, 3, 4, 5};
        int elementDoUsuniecia = 5; // Określony element do usunięcia

        // Utworzenie nowej tablicy bez określonego elementu
        int[] nowaTablica1 = Arrays.stream(tablicaPierwsza)
                .filter(element -> element != elementDoUsuniecia)
                .toArray();

        // Wyświetlenie oryginalnej tablicy i nowej tablicy bez określonego elementu
        System.out.println("Oryginalna tablica: " + Arrays.toString(tablicaPierwsza));
        System.out.println("Nowa tablica bez elementu " + elementDoUsuniecia + ": " + Arrays.toString(nowaTablica1));

        /** 7. POŁĄCZENIE TABLICY 1 i 2 */
        // int[] tablicaPierwsza = {1, 2, 3, 4, 5};
        // int[] tablicaDruga = {6, 7, 8, 9, 10};
        // Obliczenie długości nowej tablicy na podstawie sumy długości obu tablic
        int dlugoscNowejTablicy = tablicaPierwsza.length + tablicaDruga.length;

        // Inicjalizacja nowej tablicy o odpowiedniej długości
        int[] nowaTablica2 = new int[dlugoscNowejTablicy];

        // Skopiowanie zawartości tablicyPierwsza do nowejTablicy2
        System.arraycopy(tablicaPierwsza, 0, nowaTablica2, 0, tablicaPierwsza.length);

        // Skopiowanie zawartości tablicaDruga do nowejTablicy2, zaczynając od pozycji, na którą zakończyła się tablicaPierwsza
        System.arraycopy(tablicaDruga, 0, nowaTablica2, tablicaPierwsza.length, tablicaDruga.length);

        // Wyświetlenie nowej tablicy po połączeniu
        System.out.println("Nowa tablica po połączeniu: " + Arrays.toString(nowaTablica2));

        /** 8. LICZBA WYSTĄPIEŃ ELEMENTU w TABLICY 2 */
        // int[] tablicaDruga = {6, 7, 8, 9, 10};
        int szukanaWartosc = 8; // Wartość, której wystąpienia chcemy policzyć
        int liczbaWystapien = 0; // Licznik wystąpień

        // Przejście przez każdy element tablicy i zliczenie wystąpień określonej wartości
        for (int i = 0; i < tablicaDruga.length; i++) {
            if (tablicaDruga[i] == szukanaWartosc) {
                liczbaWystapien++;
            }
        }

        // Wyświetlenie liczby wystąpień określonej wartości w tablicy
        System.out.println("Liczba wystąpień wartości " + szukanaWartosc + " w drugiej tablicy: " + liczbaWystapien);
    }
}
