/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import DAO.NotaFiscalDAO;
import model.NotaFiscal;

/**
 *
 * @author roger.areis
 */
public class NotaFiscalController {

    public static boolean SalvarNotaFiscal(int pNumeroNota, double pValorNota) {

        NotaFiscal objNotaFiscal = new NotaFiscal();

        boolean retorno = NotaFiscalDAO.SalvarNotaFiscal(objNotaFiscal);
        return false;
    }
}
