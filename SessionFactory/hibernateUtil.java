import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {
    public static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(UserClassHiber.class)
                    .buildSessionFactory();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Session getSession() {
        return sessionFactory.getCurrentSession();
    }
     public static void close() {
        sessionFactory.close();
    }
}
