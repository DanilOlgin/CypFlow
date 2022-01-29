import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoryTest {
        public static void main(String[] args) {

            com.bookstore.entity.Category category = new com.bookstore.entity.Category();
            category.setName("Fiction");


            EntityManagerFactory entityManagerFactory =
                    Persistence.createEntityManagerFactory("BookStoreWebsite");

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(category);
            entityManager.getTransaction().commit();

            entityManager.close();
            entityManagerFactory.close();

            System.out.println("Category object has been persisted");

        }
    }
