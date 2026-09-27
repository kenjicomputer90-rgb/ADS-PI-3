package com.loja_roupas;


/* 
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
*/


import com.loja_roupas.model.Cliente;
import com.loja_roupas.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

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

        HibernateUtil.getSessionFactory().close();
    }
}
