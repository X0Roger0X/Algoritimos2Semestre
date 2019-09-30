/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Funcionario;

public class FuncionarioDAO {

    public static boolean SalvarFuncionario(Funcionario pFuncionario) {

        return SimulaBancoDados.getInstance().SalvarFuncionario(pFuncionario);

    }
}
