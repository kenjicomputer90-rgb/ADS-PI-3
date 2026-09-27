package com.loja_roupas.Controller;


import com.loja_roupas.dao.ClienteDAO;
import com.loja_roupas.model.Cliente;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TelaInicialController {

    @FXML
    private void abrirProdutos(ActionEvent event) {
    	cadastrar();
         
        System.out.println("Abrindo produtos...");
    }

    @FXML
    private void abrirVendas(ActionEvent event) {
        System.out.println("Abrindo vendas...");
    }

    @FXML
    private void abrirClientes(ActionEvent event) {
        System.out.println("Abrindo clientes...");
    }

    @FXML
    private void abrirEstoque(ActionEvent event) {
        System.out.println("Abrindo estoque...");
    }
    
    private final ClienteDAO clienteDAO = new ClienteDAO();

    public void cadastrar() {

        Cliente cliente = new Cliente();

        cliente.setNome("Eduardo");
        cliente.setTelefone("19999999999");

        clienteDAO.salvar(cliente);
    }
    
    //HibernateUtil.getSessionFactory().close();
}