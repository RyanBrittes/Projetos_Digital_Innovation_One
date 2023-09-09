public class Palavra {
    //Atributo
    private String palavras;

    //Construtor
    public Palavra(String palavras) {
        this.palavras = palavras;
    }

    //Getter
    public String getPalavras() {
        return palavras;
    }

    //Sobreescrição do valor quando o atributo for chamado
    public String toString() {
        return "Palavra = " + palavras + "\n";
    }

    //Equals and HasjCode para evitar duplicatas
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavras == null) ? 0 : palavras.hashCode());
        return result;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Palavra other = (Palavra) obj;
        if (palavras == null) {
            if (other.palavras != null)
                return false;
        } else if (!palavras.equals(other.palavras))
            return false;
        return true;
    }
}
