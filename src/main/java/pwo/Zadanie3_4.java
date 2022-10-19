package pwo;

public class Zadanie3_4 {

    public static final int FROM = 0, TO = 99;
    public static final String FILE_NAME = "lucasseq100.txt";

    public static void main(String[] args) {

        System.out.println("Lucas wersja 1");

        boolean ok = SequenceTools.writeLucasToFile(new LucasGenerator(), FROM, TO, FILE_NAME);

        if (ok) {
            System.out.println("Wynik zapisany do pliku: " + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }
    }
}
