import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Users;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import static org.junit.Assert.assertTrue;


public class UserDAOTest {
    private static EntityManager entityManager;
    private static EntityManagerFactory entityManagerFactory;
    private static Users user;
    private static UserDAO userDAO;

    @BeforeClass
    public static void setUp() {
        user = new Users();
        entityManagerFactory =
                Persistence.createEntityManagerFactory("BookStoreWebsite");
        entityManager = entityManagerFactory.createEntityManager();

        userDAO = new UserDAO(entityManager);
    }

    @Test
    public void testCreateUsers() {
        user.setEmail("danilolgin1@gmail.com");
        user.setFullName("Daniil Olgin");
        user.setPassword("Hello Password!");

        user = userDAO.create(user);

        assertTrue(user.getUserId() > 0);
    }

    @Test (expected = PersistenceException.class)
    public void testCreateUsersFilesNotSet() {
        user = userDAO.create(user);

        assertTrue(user.getUserId() > 0);
    }

    @Test
    public void testUpdateUsers() {
        user.setUserId(1);
        user.setEmail("updatedemail@gmail.com");
        user.setPassword("updatedPassword");
        user.setFullName("New Name");
        user = userDAO.update(user);


        assertTrue(user.getUserId()==1);
    }

    @AfterClass
    public static void tearDown() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
