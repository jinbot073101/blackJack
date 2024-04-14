import java.util.ArrayList;

public class Jugador {
    private ArrayList<Carta> baraja;


    public Jugador(Mazo mazo) {
        baraja = new ArrayList<Carta>();
        this.agregarCartaBaraja(mazo);
        this.agregarCartaBaraja(mazo);
    }

    public void agregarCartaBaraja(Mazo mazo) {
        baraja.add(mazo.sacarCarta());
    }

    public ArrayList<Carta> getBaraja() {

        return baraja;
    }

    public int calcularValorBaraja() {
        int valor = 0;
        int numAs = 0;

        for (Carta carta : baraja) {
            valor += carta.getValor();
            if (carta.getValor() == 11) {
                numAs++;
            }
        }

        while (valor > 21 && numAs > 0) {
            valor -= 10;
            numAs--;
        }

        return valor;

    }

    public void mostrarPuntos() {
        System.out.println(calcularValorBaraja());

    }


}
