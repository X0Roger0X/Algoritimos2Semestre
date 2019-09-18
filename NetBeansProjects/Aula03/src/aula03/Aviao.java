/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author roger.areis
 */
public class Aviao {

    //paramentros ou atributos - variaveis dos objetos que eu for construir
    private String turbina;
    private String cor;
    private String[] asas;

    public String getCor() {
        return this.cor;
    }

    public void setCor(String paramentroCor) {
        this.cor = paramentroCor;

    }

    public Aviao(String cor) {
        this.cor = cor;

    }

    public Aviao() {
        this.cor = "Branco";

    }
}
