package boletin15;
import personal.Persoal;

public class Academia {
   static int numReferencia=2020;
    private String nome;
    private int nota;
       Persoal alum = new Persoal();

    public Academia(String nome, int nota,String telefono,String correo) {
        this.nome = nome;
        this.nota = nota;
        alum.setTeléfono(telefono);
        alum.setCorreo(correo);
        numReferencia++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", nota=" + nota + ", referencia=" + numReferencia + alum.toString();
    }
}
    