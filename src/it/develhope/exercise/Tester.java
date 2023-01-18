package it.develhope.exercise;

public class Tester {

    public static void main(String[] args) {

        /**
         * Nella classe teste ho creato un oggetto di tipo car, ho chiamato i due metodi e sopra la creazione
         * dell'oggetto ho aggiuto un annotazione di SuppressWarnings che sopprimesse i messaggi di deprecato del
         * metodo printCarDetails
         */
        @SuppressWarnings(value = "deprecated")
        Car audi = new Car("Audi", 100000);
        audi.printCarDetails();
        audi.getCarDetails();
    }

}
