/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerreisado3.DAO;

import rogerreisado3.model.Carro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import rogerreisado3.model.Carro;

public class CarroDAO {

//TODO: Linhas abaixo deverão ser removidas futuramente com o uso de uma classe de Conexão
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";  //A partir da versao 8.0 do MySQL, mudou para com.mysql.cj.jdbc.Driver (Connector/J)
    public static String LOGIN = "root";                     //nome de um usuário de seu BD
    public static String SENHA = "";                         //sua senha de acesso

    public static String URL = "jdbc:mysql://localhost:3307/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";

    public static boolean salvar(Carro p) {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null;

        try {
            //Carrega a classe responsável pelo driver
            Class.forName(DRIVER);

            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            instrucaoSQL = conexao.createStatement();

            int linhasAfetadas = instrucaoSQL.executeUpdate("INSERT INTO cliente (nome,CPF) "
                    + "VALUES("
                    + "'" + p.getModelo() + "'" + ","
                    + "'" + p.getCPF().replace(".", "").replace("-", "") + "'" + ")"
            );

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            retorno = false;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static boolean atualizar(Carro p) {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null;

        try {
            //Carrega a classe responsável pelo driver
            Class.forName(DRIVER);

            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            instrucaoSQL = conexao.createStatement();

            int linhasAfetadas = instrucaoSQL.executeUpdate("update Carro set nome = "
                    + "'" + p.getModelo() + "'" + ","
                    + "cpf = "
                    + "'" + p.getCPF().replace(".", "").replace("-", "") + "'"
                    + "where idcliente = " + p.getId()
            );

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            retorno = false;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
            }
        }

        return retorno;

    }

    public static boolean excluir(int pID) {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null;

        try {
            //Carrega a classe responsável pelo driver
            Class.forName(DRIVER);

            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            instrucaoSQL = conexao.createStatement();

            int linhasAfetadas = instrucaoSQL.executeUpdate("delete from Carro where idcliente = " + pID
            );

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            retorno = false;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
            }
        }

        return retorno;

    }

    public static ArrayList<Carro> consultar() {
        Connection conexao = null;
        Statement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Carro> listaClientes = new ArrayList<Carro>();

        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            instrucaoSQL = conexao.createStatement();
            rs = instrucaoSQL.executeQuery("SELECT * FROM carro;");

            while (rs.next()) {
                carro c = new Carro();
                c.setId(rs.getInt("idcarro"));
                c.getModelo(rs.getString("modelo"));
                c.setCPF(rs.getString("CPF"));
                listaCarro.add(c);
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            listaClientes = null;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaClientes = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
            }
        }

        return listaClientes;
    }

}
