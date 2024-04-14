public class Carta {

    private int valor;
    private String tipo;
    private String simbolo;

    public Carta(int valor, String tipo, String simbolo) {
        this.tipo = tipo;
        this.valor = valor;
        this.simbolo = simbolo;
    }

    public int getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    @Override
    public String toString(){
        return tipo +" "+valor;
    }
}

