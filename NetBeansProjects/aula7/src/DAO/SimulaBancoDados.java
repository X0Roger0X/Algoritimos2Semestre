/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

public class SimulaBancoDados {

    private static SimulaBancoDados objBancoSimulado;

    public ArrayList<NotaFiscal> linhasTabelaNotaFiscal;

    public SimulaBancoDados() {

        linhasTabelasNotaFiscal = new ArrayList<>();

    }

    public static synchronized SimulaBancoDados getInstance() {

        if (objBancoSimulado == null) {
            objBancoSimulado = new

        }
    }

    public
}
