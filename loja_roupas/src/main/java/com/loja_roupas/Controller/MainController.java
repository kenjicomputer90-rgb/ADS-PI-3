package com.loja_roupas.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MainController {

    @FXML
    private VBox content;

    @FXML
    public void initialize() {
        //primeira tela a iniciar
        carregarTela("/com/loja_roupas/View/TelaInicial.fxml");
    }

    @FXML
    private void abrirEstoque() {
        carregarTela("/com/loja_roupas/View/Estoque.fxml");
    }

    @FXML
    private void abrirClientes() {
        carregarTela("/com/loja_roupas/View/Clientes.fxml");
    }

    @FXML
    private void abrirFuncionarios() {
        carregarTela("/com/loja_roupas/View/Funcionarios.fxml");
    }

    private void carregarTela(String caminho) {
        try {
            FXMLLoader loader =
                    new FXMLLoader(getClass().getResource(caminho));

            Node tela = loader.load();

            //carrega a tela principal com base na escolha na barra lateral
            content.getChildren().setAll(tela);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}