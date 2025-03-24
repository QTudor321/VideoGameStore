package application.TOV_App;
import database.IssueDao;
import entity.Issue;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IssueFindTest {
    private static EntityManagerFactory emf;
    private static IssueDao issueDao;

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("TOVPersistenceUnit");
        issueDao = new IssueDao(emf);
    }

    @AfterAll
    public static void tearDown() {
        if (emf != null) {
            emf.close();
        }
    }
    @Test
    public void testFindIssue() {
        Issue issue = new Issue("Find Title", "Find Description", "2024-01-01");
        issueDao.create(issue);

        Issue foundIssue = issueDao.find(issue.getId());
        assertNotNull(foundIssue);
        assertEquals("Find Title", foundIssue.getTitleIssue());
        assertEquals("Find Description", foundIssue.getDescriptionIssue());
        assertEquals("2024-01-01", foundIssue.getReportDate());
    }
}
