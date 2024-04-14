import java.util.*;

public class Juego {

    private Mazo mazo = new Mazo();
    private Jugador jugador;
    private Crupier crupier;

    public Juego() {
        jugador = new Jugador(mazo);
        crupier = new Crupier(mazo);

    }

    public void iniciarJuego() {

        System.out.println("=====================================");
        System.out.println("Cartas en la mano del jugador:");
        System.out.println(" ");
        for (Carta carta : jugador.getBaraja()) {
            System.out.println(carta.toString());
        }

        System.out.println(" ");
        System.out.println("PUNTOS: ");
        jugador.mostrarPuntos();

        while (jugador.calcularValorBaraja() < 21) {

            Scanner scanner = new Scanner(System.in);

            System.out.println(" ");
            System.out.println("1.PIDE | 2.PASA");
            int elegir = scanner.nextInt();

            if (elegir == 1) {
                jugador.agregarCartaBaraja(mazo);
                System.out.println("=====================================");
                System.out.println("Cartas en la mano del jugador:");
                System.out.println(" ");
                for (Carta carta : jugador.getBaraja()) {
                    System.out.println(carta.toString());
                }

                System.out.println(" ");
                System.out.println("PUNTOS: ");
                jugador.mostrarPuntos();

            } else {
                break;

            }


        }
        while (crupier.juegoCrupier(mazo)) {
            for (Carta carta : crupier.getBaraja()) {
                System.out.println(carta.toString());
            }
        }

        System.out.println("==================================");
        System.out.println("FIN DE LA PARTIDA");
        System.out.println("==================================");
        System.out.println("PUNTOS CRUPIER: ");
        crupier.mostrarPuntos();
        System.out.println(" ");
        System.out.println("PUNTOS JUGADOR: ");
        jugador.mostrarPuntos();

        if (jugador.calcularValorBaraja() > crupier.calcularValorBaraja() &&
                jugador.calcularValorBaraja() <=21) {
            System.out.println(" ");
            System.out.println("-----------------------------------");
            System.out.println("GANADOR: Jugador");
            System.out.println("-----------------------------------");
        }
        if (crupier.calcularValorBaraja() > jugador.calcularValorBaraja() &&
                crupier.calcularValorBaraja() <= 21 || crupier.calcularValorBaraja() < 21) {
            System.out.println(" ");
            System.out.println("-----------------------------------");
            System.out.println("GANADOR: Crupier");
            System.out.println("-----------------------------------");
        }
        if (crupier.calcularValorBaraja() == jugador.calcularValorBaraja() &&
                jugador.calcularValorBaraja() <= 21 && crupier.calcularValorBaraja() <= 21) {
            System.out.println(" ");
            System.out.println("-----------------------------------");
            System.out.println("EMPATE");
            System.out.println("-----------------------------------");

        }

    }
}
