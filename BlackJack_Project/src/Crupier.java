public class Crupier extends Jugador {
  
    public Crupier(Mazo mazo) {
        super(mazo);
    }

    public boolean juegoCrupier(Mazo mazo){
        boolean cierto = false;
        while (calcularValorBaraja() < 18){
            System.out.println("Crupier pide.");
            super.agregarCartaBaraja(mazo);
            cierto = true;
        }
        return cierto;
    }
    
}
