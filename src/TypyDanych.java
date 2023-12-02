import java.util.Scanner; // wymagana biblioteka do Scanner'a

public class TypyDanych {
    public static void main(String[] args) {
        // Deklaracja zmiennych
        int liczbaCalkowita;
        double liczbaZmiennoprzecinkowa;
        char znak;
        boolean wartoscLogiczna;

        /** SCANNER */
        // Utworzenie obiektu Scanner do odczytu danych wejściowych
        Scanner scanner = new Scanner(System.in);

        // Pobieranie wartości dla zmiennej typu int
        System.out.print("Podaj liczbę całkowitą: ");
        liczbaCalkowita = scanner.nextInt();

        // Pobieranie wartości dla zmiennej typu double
        System.out.print("Podaj liczbę zmiennoprzecinkową (z kropką): ");
        liczbaZmiennoprzecinkowa = scanner.nextDouble();

        // Pobieranie wartości dla zmiennej typu char
        System.out.print("Podaj jeden znak: ");
        znak = scanner.next().charAt(0);

        // Pobieranie wartości dla zmiennej typu boolean
        System.out.print("Podaj wartość logiczną (true/false): ");
        wartoscLogiczna = scanner.nextBoolean();

        // Wyświetlenie wprowadzonych wartości
        System.out.println("Wprowadzone wartości:");
        System.out.println("Liczba całkowita: " + liczbaCalkowita);
        System.out.println("Liczba zmiennoprzecinkowa: " + liczbaZmiennoprzecinkowa);
        System.out.println("Znak: " + znak);
        System.out.println("Wartość logiczna: " + wartoscLogiczna);

        /** KONWERSJE */
        // 1. double -> int
        int zDoubleNaInt = (int) liczbaZmiennoprzecinkowa;
        // 2. int -> double
        double zIntNaDouble = (double) liczbaCalkowita;
        // 3. char -> int
        int zCharNaInt = (int) znak;
        // 4. boolean -> string
        String zBooleanNaString = Boolean.toString(wartoscLogiczna);

        // Wyświetlenie wyników konwersji
        System.out.println("Wyniki konwersji:");
        System.out.println("double na int: " + zDoubleNaInt);
        System.out.println("int na double: " + zIntNaDouble);
        System.out.println("char na int: " + zCharNaInt);
        System.out.println("boolean na string: " + zBooleanNaString);

        // Zamknięcie skanera
        scanner.close();

    }
}

