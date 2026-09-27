package com.loja_roupas.util;

import com.loja_roupas.model.Cliente;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory =
            new Configuration()
                    .configure()
                    .addAnnotatedClass(Cliente.class)
                    .buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}