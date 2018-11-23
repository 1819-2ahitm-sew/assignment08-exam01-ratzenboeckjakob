package at.htl.exam01.document;

import java.lang.reflect.Array;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {
         Book book1 = new Book("Rowlings", "Harry Potter und der Stein der Weisen");
         Email email = new Email("Susi", "Bewerbung", "CoolCompany");
         Book book2 = new Book("Tolkien", "lordOfTheRings");

         int anzahlEmail = 0, anzahlBook = 0;

         Document[] documents = {
                 book1,
                 email,
                 book2
         };

        for (int i = 0; i < documents.length; i++) {
            if (documents[i] instanceof Book) {
                System.out.println("Book: " + documents[i]);

                anzahlBook++;
            } else if (documents[i] instanceof Email) {
                System.out.println("Email: " + documents[i]);

                anzahlEmail++;
            }
        }

        System.out.println("\nAnzahl Books: " + anzahlBook);
        System.out.println("Anzahl Email: " + anzahlEmail);
    }




}
