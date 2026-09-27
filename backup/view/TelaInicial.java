package com.loja_roupas.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class TelaInicial extends BorderPane {

    public TelaInicial() {

        // Título
        Label titulo = new Label("LOJA DE ROUPAS");
        titulo.getStyleClass().add("titulo");

        Label subtitulo = new Label("Sistema de Gerenciamento");
        subtitulo.getStyleClass().add("subtitulo");

        VBox cabecalho = new VBox(5, titulo, subtitulo);
        cabecalho.setAlignment(Pos.CENTER);

        setTop(cabecalho);

        // Botões
        Button produtos = criarBotao("Produtos");
        Button vendas = criarBotao("Vendas");
        Button clientes = criarBotao("Clientes");
        Button estoque = criarBotao("Estoque");

        GridPane menu = new GridPane();

        menu.setHgap(20);
        menu.setVgap(20);
        menu.setAlignment(Pos.CENTER);

        menu.add(produtos, 0, 0);
        menu.add(vendas, 1, 0);
        menu.add(clientes, 0, 1);
        menu.add(estoque, 1, 1);

        setCenter(menu);

        // Espaçamento
        setStyle("-fx-padding: 40;");
    }

    private Button criarBotao(String texto) {
        Button botao = new Button(texto);

        botao.getStyleClass().add("menu-button");

        return botao;
    }
}