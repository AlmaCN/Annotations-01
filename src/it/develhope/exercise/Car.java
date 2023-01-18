package it.develhope.exercise;

public class Car {

    /**
     * Ho creato la classe car con le due variabili
     * String name
     * int mileage
     */
    public String name;
    public int mileage;

    /**
     * Ho creato il costruttore che prende due parametri
     * @param name il nome della macchina
     * @param mileage il kilometraggio della macchina
     * Ed ho assegnato i parametri alle due variabili della classe
     */
    public Car(String name, int mileage){
        this.name = name;
        this.mileage = mileage;
    }

    /**
     * Ho creato il primo metodo printCarDetails che stampa tutte le informazioni della macchina sulla stessa riga
     * e lho reso Deprecato aggiungendo l'annotazione @Deprecated, cio che in futuro verra sostituito
     */
    @Deprecated
    public void printCarDetails(){
        System.out.println("Car name is " + name + ", car mileage is " + mileage);
    }

    /**
     * Qua ho creato il metodo getCarDetails che sostituira printCarDetails, e che stampera su due righe diverse il
     * nome ed il kilometraggio.
     */
    public void getCarDetails(){
        System.out.println("Car name is " + name + "\nCar mileage is " + mileage);
    }
}
