package application.TOV_App;

import database.AdminDao;
import entity.Admin;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AdminFindTest {
    private static EntityManagerFactory emf;
    private static AdminDao adminDao;

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("TOVPersistenceUnit");
        adminDao = new AdminDao(emf);
    }

    @AfterAll
    public static void tearDown() {
        if (emf != null) {
            emf.close();
        }
    }
    @Test
    public void testFindAdmin() {
        Admin admin = new Admin("Find Name", "Find Password");
        adminDao.create(admin);

        Admin foundAdmin = adminDao.find(admin.getId());
        assertNotNull(foundAdmin);
        assertEquals("Find Name", foundAdmin.getName());
        assertEquals("Find Password", foundAdmin.getPassword());
    }
}
