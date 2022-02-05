import com.photostore.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UsersTest {
    public static void main(String[] args) {

        Users user = new Users();
        user.setEmail("danilolgin1@gmail.com");
        user.setFullName("Daniil Olgin");
        user.setPassword("Hello Password!");


        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("PhotoStoreWebsite");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        System.out.println("User object has been persisted");

    }
}
