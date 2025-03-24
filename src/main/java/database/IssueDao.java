package database;
import entity.Issue;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
public class IssueDao extends GenericDao<Issue> {
    private EntityManagerFactory factory;
    public IssueDao(EntityManagerFactory factory) {
        super(Issue.class);
        this.factory=factory;
    }
    public EntityManager getEntityManager(){
        try{
            return factory.createEntityManager();
        }catch(Exception e){
            System.out.println("Entity manager cannot be created!");
            return null;
        }
    }
}
