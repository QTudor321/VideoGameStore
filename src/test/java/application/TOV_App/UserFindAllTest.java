package application.TOV_App;
import database.UserDao;
import entity.User;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UserFindAllTest {
    private static EntityManagerFactory emf;
    private static UserDao userDao;

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("TOVPersistenceUnit");
        userDao = new UserDao(emf);
    }

    @AfterAll
    public static void tearDown() {
        if (emf != null) {
            emf.close();
        }
    }
    @Test
    public void testFindAllUsers() {
        User user1 = new User("John", "john123");
        User user2 = new User("Kevin", "kevin123");
        userDao.create(user1);
        userDao.create(user2);

        List<User> users = userDao.findAll();
        assertTrue(users.size() >= 2);
    }
}
