import java.util.Arrays;

/**
 * Implementare una classe Street, che rappresenta una strada a senso unico. Il
 * costruttore accetta la lunghezza della strada in chilometri.
 * Il metodo insertCar() accetta un intero (km) come argomento ed aggiunge un’automobile
 * al chilometro km.
 * L’automobile inserita percorrerà la strada alla velocità
 * di un chilometro al minuto, (60 km/h) fino alla fine della stessa.
 * Il metodo
 * getCarsByPosition() riceve come parametro un intero (km) e restituisce il
 * numero di automobili presenti al chilometro km. Il metodo progress() simula
 * il passaggio di 1 minuto di tempo (cioè fa avanzare tutte le automobili di
 * un chilometro).
 * <p>
 * Fornire infine la classe di metodo main dimostrativo.
 *
 * @author Nicola Bicocchi
 */

public class Street {
    int[] cars;

    /**
     * costruttore,
     * getter,setter
     */

    public Street(int km) {
        cars = new int[km];
    }

    public int[] getCars() {
        return cars;
    }

    public void setCars(int[] cars) {
        this.cars = cars;
    }


    @Override
    public String toString() {
        return "Street{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }

    public void insertcar(int km) {
        cars[km]++;
    }

    /**
     * Progresscar simula
     * un minuto
     * di tempo
     */



    public int getCarsbyPosition(int km) {
        return cars[km];
    }

    public void progresscar() {
        for (int i = cars.length -1; i > 0; i--) {
            cars[i] = cars[i - 1];
        }
        cars[0] = 0;
    }

    public static void main(String[] args) {
        Street s = new Street(10);
        s.insertcar(0);
        s.insertcar(0);
        s.insertcar(5);
        s.insertcar(9);

        System.out.println("al km=0 ci sono " + s.getCarsbyPosition(0) + " macchine");
        System.out.println("al km=4 ci sono " +s.getCarsbyPosition(4)+ " macchine");
        System.out.println("al km=9 ci sono " +s.getCarsbyPosition(9)+ " macchine");

        System.out.println(s);

        s.progresscar();
        System.out.println(s.getCarsbyPosition(0));
        System.out.println(s.getCarsbyPosition(1));

        System.out.println(s);
    }
}
