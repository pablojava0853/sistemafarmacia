package com.pgs.farmacia.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
private static final String USUARIO = "root";
private static final String SENHA = "123456";
//private static final String URL = "jdbc:mysql://localhost:3306/sistema";
private static final String URL = "jdbc:oracle:thin:scott/tiger@myhost:1521:orcl";

public static Connection conectar() throws SQLException{
	
	//Referencia ao Driver mysql para versões antigas do java
	DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
	
	Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
	return conexao;
}

public static void main(String[] args) {
	try{
	Connection conexao = ConexaoFactory.conectar();
	System.out.println("Conectado com sucesso!!");
	}
	
	catch(SQLException ex){
		ex.printStackTrace();
		System.out.println("Conexão falhou!!");
	}
}

}
