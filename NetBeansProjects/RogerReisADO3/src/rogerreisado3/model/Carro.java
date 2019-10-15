package rogerreisado3.model;

public class Carro {

    private static int qtdCarroCriados;

    private int id;
    private String modelo;
    private int ano;
    private double valor;

    public Carro(int id) {
        qtdCarroCriados++;
        this.id = qtdCarroCriados;
    }

    public Carro(String modelo) {
        qtdCarroCriados++;
        this.id = qtdCarroCriados;
        this.modelo = modelo;
    }

    public Carro(int id, String pmodelo, int ano, double valor) {
        this.id = id;
        this.modelo = pmodelo;
        this.ano = ano;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
