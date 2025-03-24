package application.TOV_App;
import database.UserDao;
import java.util.List;
import entity.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class DatabaseConnectionTest {
    private EntityManagerFactory factory;
    private EntityManager em;
    private UserDao userdao;

    @BeforeEach
    public void setUp(){
        factory=Persistence.createEntityManagerFactory("TOVPersistenceUnit");
        em=factory.createEntityManager();
        userdao=new UserDao(factory);
    }
    @AfterEach
    public void tearDown(){
        if(em!=null && em.isOpen()){
            em.close();
        }
        if(factory!=null && factory.isOpen()){
            factory.close();
        }
    }
    @Test
    public void testDatabaseConnection(){
        User user=new User("someeee","Doe","John","Utah no. 18","johnyutah234");
        userdao.create(user);
        List<User> userslist=userdao.findAll();
        assertNotNull(userslist);
        assertTrue(!userslist.isEmpty());
    }
}
