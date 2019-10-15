/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerreisado3.controller;

import java.util.ArrayList;
import rogerreisado3.DAO.CarroDAO;
import rogerreisado3.model.Carro;

/**
 *
 * @author roger.areis
 */
public class CarroController {

    public static boolean salvar(String pNome, String pCPF) {
        //Salvo na memória
        Carro p = new Carro(pNome, pCPF);
        return CarroDAO.salvar(p);
    }

    public static boolean excluir(int pID) {
        return CarroDAO.excluir(pID);
    }

    public static boolean atualizar(int pId, String pNome, String pCPF) {
        Carro p = new Carro(pId, pNome, pCPF);
        return CarroDAO.atualizar(p);

    }

    public static ArrayList<String[]> consultar() {
        ArrayList<Carro> Carro = CarroDAO.consultar();
        ArrayList<String[]> listaCarro = new ArrayList<>();

        for (int i = 0; i < Carro.size(); i++) {
            listaCarro.add(new String[]{String.valueOf(Carro.get(i).getId()), Carro.get(i).getNome(), String.valueOf(Carro.get(i).getCPF())});

        }

        return listaCarro;

    }

}

}
