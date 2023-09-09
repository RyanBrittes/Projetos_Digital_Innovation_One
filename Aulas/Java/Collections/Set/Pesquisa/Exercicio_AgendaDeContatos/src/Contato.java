public class Contato {
    //Atributos
    private String nome;
    private int numero;

    //Construtor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    //Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Quando for chamado por um Get a busca apresetará um resultado formatado
    public String toString() {
        return "Nome = " + nome + " /Numero = " + numero + "\n";
    }

    //Equals and HashCode para evitar duplicações de dados
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
}
