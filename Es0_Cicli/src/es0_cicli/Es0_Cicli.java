package es0_cicli;

/**
 *
 * @author Fabio.Anelli
 */
public class Es0_Cicli {

    public static void main(String[] args) {
        // Ciclo FOR 
        // La sintassi include l'inizializzazione, la condizione e l'incremento
        // Uso l'operatore % per verificare se il numero è pari
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " "); //PrintLN Stampa un valore sotto l'altro   
            }
        }

        // Uso l'operatore % per verificare se il numero è dispari
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");   //Print Stampa sulla stessa linea
            }
        }

        System.out.println("");

        // Ciclo FOREACH
        // Forma semplificata per ciclare sugli elementi di una collezione (arary, liste o insiemi)
        String[] colors = {"Red", "Black", "Yellow", "Green", "Blue"};
        for (String color : colors) {
            System.out.println(color + " ");
        }

        // Ciclo WHILE
        // Esegue un blocco di codice finchè una certa condizionnne è vera
        int j = 0;
        while (j < 2) {
            System.out.println(j + " ");
            j++;
        }

        // Ciclo DO-WHILE
        // Simile al WHILE ma esegue un blocco di codice almeno una volta per poi controllare la condizione
        int k = 50;
        do {
            System.out.println(k + " ");
            k++;
        } while (k < 50);

    }

}
