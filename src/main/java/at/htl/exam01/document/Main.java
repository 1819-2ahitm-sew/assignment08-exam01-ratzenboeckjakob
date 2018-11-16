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

        String bookOne = "Buch: 'Rowlings', 'Harry Potter und der Stein der Weisen'";
        String email = "Email: 'Susi', 'Bewerbung', 'CoolCompany'";
        String bookTwo = "Buch: 'Tolkien', 'lordOfTheRings'";
        String[] document = new String[3];

        document[0] = bookOne;
        document[1] = email;
        document[2] = bookTwo;


    }




}
