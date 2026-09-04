package com.loja_roupas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader =
                new FXMLLoader(getClass().getResource("/com/loja_roupas/View/Main.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Loja de Roupas");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}