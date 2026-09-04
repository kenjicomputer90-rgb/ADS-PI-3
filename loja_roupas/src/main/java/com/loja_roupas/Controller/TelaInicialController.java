package com.loja_roupas.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TelaInicialController {

    @FXML
    private void abrirProdutos(ActionEvent event) {
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
}