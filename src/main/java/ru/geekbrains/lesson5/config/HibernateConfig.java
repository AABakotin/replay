package ru.geekbrains.lesson5.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.geekbrains.lesson5.entities.Student;

public class HibernateConfig {

    private static SessionFactory instance;

    private static SessionFactory buildSessionFactory() {
        return new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

    }

    public static SessionFactory getSessionFactory() {
        if(instance == null){
            instance = buildSessionFactory();
        }
        return instance;
    }

    public static void shutdown(){
        getSessionFactory().close();
    }
}
