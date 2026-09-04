package com.loja_roupas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.loja_roupas.view.TelaInicial;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        TelaInicial telaInicial = new TelaInicial();

        Scene scene = new Scene(telaInicial, 1000, 650);
        scene.getStylesheets().add(
            getClass().getResource("/css/style.css").toExternalForm()
            );
        stage.setTitle("Loja de Roupas");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}