package com.loja_roupas.Controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.loja_roupas.model.Cliente;
import com.loja_roupas.util.HibernateUtil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TelaInicialController {

    @FXML
    private void abrirProdutos(ActionEvent event) {
    	 try (Session session = HibernateUtil
                 .getSessionFactory()
                 .openSession()) {

             Transaction transaction = session.beginTransaction();

             Cliente cliente = new Cliente(
                     "Eduardo",
                     "19999999999"
             );

             session.persist(cliente);

             transaction.commit();
         }

         
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
    
    //HibernateUtil.getSessionFactory().close();
}