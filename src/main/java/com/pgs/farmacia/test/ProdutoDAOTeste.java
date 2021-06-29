package com.pgs.farmacia.test;


import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import com.pgs.farmacia.DAO.ProdutoDAO;
import com.pgs.farmacia.domain.Fornecedores;
import com.pgs.farmacia.domain.Produtos;

public class ProdutoDAOTeste {
	
	@Test
	@Ignore
	public void salvar()throws SQLException{
	 Produtos p1 = new Produtos();
		p1.setDescricao("ASPIRINA");
		p1.setPreco(4.99);
		p1.setQuantidade(12L);
		
		Fornecedores f = new Fornecedores();
		f.setCodigo((long) 13);
		p1.setFornecedores(f);
		
		
		
		ProdutoDAO fdao = new ProdutoDAO();
		
		fdao.salvar(p1);
	}
	
	@Test
	@Ignore
	public void listar()throws SQLException{
	
		ProdutoDAO fdao = new ProdutoDAO();
		ArrayList<Produtos> lista = fdao.listar();
		
		for (Produtos p : lista){
			System.out.println("Código do Produto: " + p.getCodigo());
			System.out.println("Descrição do Produto: " + p.getDescricao());
			System.out.println("Valor do Produto: " + p.getPreco());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("Código do Fornecedor: " + p.getFornecedores().getCodigo());
			System.out.println("Descrição do Fornecedor: " + p.getFornecedores().getDescricao());
			System.out.println("");
		}
		
	}
	
	@Test
	@Ignore
	public void excluir()throws SQLException{
		Produtos p = new Produtos();
		p.setCodigo(3L);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.excluir(p);
	}
	
	
	@Test
	
	public void editar()throws SQLException{
		Produtos p = new Produtos();
		p.setCodigo(5L);
		p.setDescricao("Cataflan");
		p.setPreco(15.75);
		p.setQuantidade(2L);
		
		Fornecedores f = new Fornecedores();
		f.setCodigo((long) 10);
		p.setFornecedores(f);
		
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.editar(p);
	}
	
	
}

