import org.hibernate.Session;

public class HibernateMain {
    public static void main(String[] args) {
        Session session = hibernateUtil.getSession();
        try {
            UserClassHiber user = new
                    UserClassHiber("Rahul", "rahul@gmail.com");
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
            System.out.println("User saved: " + user.getId());
        } catch(Exception e) {
            e.printStackTrace();
        } 
    }
}
