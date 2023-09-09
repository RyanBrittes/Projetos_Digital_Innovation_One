public class ListaNumeros implements Comparable <ListaNumeros> {
    //Atributo
    private int numero;

    //Construtor
    public ListaNumeros(int numero) {
        this.numero = numero;
    }

    //Getter
    public int getNumero() {
        return numero;
    }

    public String toString() {
        return "Numero= " + numero;
    }

    public int compareTo(ListaNumeros ln) {
        return Integer.compare(numero, ln.getNumero());
    }

}