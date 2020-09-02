package E2.model;

public class Lugar {
    private String rua;
    private String numero;
    private String cidade;
    private String bairro;
    private String uf;
    private long cep;

    public Lugar() {
        this.rua = "";
        this.numero = "";
        this.cidade = "";
        this.bairro = "";
        this.uf = "";
        this.cep = 0;
    }

    @Override
    public String toString() {
        return rua + ", " + numero
            + "\tbairro: " + bairro + "\n"
            + "\tcidade: " + cidade + ", " + uf.toUpperCase()
            + "\tcep: " + cep;
    }
}