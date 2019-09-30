/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.NotaFiscal;

/**
 *
 * @author fernando.tfernandes
 */
public class SimulaBancoDados {

    private static SimulaBancoDados objBancoSimulado;

    public static ArrayList<NotaFiscal> linhasTabelaNotaFiscal;

    public SimulaBancoDados() {

        linhasTabelaNotaFiscal = new ArrayList<>();
    }

    //Garanto apenas um banco de dados na memória
    //Singleton
    public static synchronized SimulaBancoDados getInstance() {

        if (objBancoSimulado == null) {
            objBancoSimulado = new SimulaBancoDados();
        }

        return objBancoSimulado;
    }

    public static boolean SalvarNota(NotaFiscal pNotaFiscal) {
        linhasTabelaNotaFiscal.add(pNotaFiscal);
        return true;
    }

    public static boolean salvarFuncionario(Funcionario pFuncionario) {

        linhasTabelaFuncionario.add(pFuncionario);
    }

}
