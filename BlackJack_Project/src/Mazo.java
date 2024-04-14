import java.util.*;

public class Mazo {

    private ArrayList<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();
        inicializar();
        mezclar();

    }

    public void inicializar() {
        String[] simbolos = { "A", "J", "Q", "K", "10", "9", "8", "7", "6", "5", "4", "3", "2" };
        int[] valores = { 11, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

        for (int i = 0; i < simbolos.length; i++) {
            cartas.add(new Carta(valores[i], "Corazón", simbolos[i]));
            cartas.add(new Carta(valores[i], "Pica", simbolos[i]));
            cartas.add(new Carta(valores[i], "Trébol", simbolos[i]));
            cartas.add(new Carta(valores[i], "Diamante", simbolos[i]));
        }
    }

    public void mezclar() {
        Collections.shuffle(cartas);
    }

    public Carta sacarCarta() throws NoSuchElementException {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        } else {
            throw new NoSuchElementException("El mazo está vacío");
        }
    }

}
