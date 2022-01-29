import com.bookstore.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoryTest {
        public static void main(String[] args) {

            Category category = new Category();
            category.setName("Sci-Fi");
            category.setCategoryId("1");

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
