import com.photostore.dao.UserDAO;
import com.photostore.entity.Users;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import java.util.List;

import static org.junit.Assert.*;


public class UserDAOTest {
    private static EntityManager entityManager;
    private static EntityManagerFactory entityManagerFactory;
    private static Users user;
    private static UserDAO userDAO;

    @BeforeClass
    public static void setUp() {
        user = new Users();
        entityManagerFactory =
                Persistence.createEntityManagerFactory("PhotoStoreWebsite");
        entityManager = entityManagerFactory.createEntityManager();

        userDAO = new UserDAO(entityManager);
    }

    @Test
    public void testCreateUsers() {
        user.setEmail("test2@gmail.com");
        user.setFullName("Daniil Olgin");
        user.setPassword("Hello Password!");
        user.setUserName("Chewbacca404");

        user = userDAO.create(user);

        assertTrue(user.getUserId() > 0);
    }

    @Test(expected = PersistenceException.class)
    public void testCreateUsersFilesNotSet() {
        user = userDAO.create(user);

        assertTrue(user.getUserId() > 0);
    }

    @Test
    public void testUpdateUsers() {
        user.setUserId(5);

        user.setEmail("updatedemail1@gmail.com");
        user.setPassword("updatedPassword");
        user.setFullName("New Name");
        user.setUserName("UpdatedNickName1");
        user = userDAO.update(user);


        assertEquals(5, user.getUserId());
    }

    @Test
    public void testGetUsersFound() {
        Integer userId = 1;
        Users user = userDAO.get(userId);
        if (user != null)
            System.out.println(user.getUserId() + " " + user.getUserName() + " " + user.getFullName() + " " + user.getEmail());
        assertNotNull(user);
    }

    @Test
    public void testGetUsersNotFound(){
        Integer userId = 100;
        Users user = userDAO.get(userId);

        assertNull(user);
    }

    @Test
    public void testDeleteUsers() {
        Integer userId = 8;
        userDAO.delete(userId);

        Users user = userDAO.get(userId);
        assertNull(user);
    }

    @Test (expected = Exception.class)
    public void testDeleteNonExistingUsers() {
        Integer userId = 8;
        userDAO.delete(userId);

    }

    @Test
    public void testListAll() {
        List<Users> usersList = userDAO.listAll();
        assertTrue(usersList.size() > 0);
    }

    @Test
    public void testCountAll() {
        long a = userDAO.count();
        System.out.println(a);
        assertTrue(a>0);
    }

    @AfterClass
    public static void tearDown() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
