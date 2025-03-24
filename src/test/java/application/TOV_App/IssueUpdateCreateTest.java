package application.TOV_App;
import database.IssueDao;
import entity.Issue;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IssueUpdateCreateTest {
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
    public void testCreateIssue() {
        Issue issue = new Issue("Test Title", "Test Description", "2024-01-01");
        issueDao.create(issue);

        Issue foundIssue = issueDao.find(issue.getId());
        assertNotNull(foundIssue);
        assertEquals("Test Title", foundIssue.getTitleIssue());
        assertEquals("Test Description", foundIssue.getDescriptionIssue());
        assertEquals("2024-01-01", foundIssue.getReportDate());
    }
    @Test
    public void testUpdateIssue() {
        Issue issue = new Issue("Initial Title", "Initial Description", "2024-01-01");
        issueDao.create(issue);

        issue.setTitleIssue("Updated Title");
        issue.setDescriptionIssue("Updated Description");
        issue.setReportDate("2024-12-31");
        issueDao.update(issue);

        Issue updatedIssue = issueDao.find(issue.getId());
        assertNotNull(updatedIssue);
        assertEquals("Updated Title", updatedIssue.getTitleIssue());
        assertEquals("Updated Description", updatedIssue.getDescriptionIssue());
        assertEquals("2024-12-31", updatedIssue.getReportDate());
    }

}