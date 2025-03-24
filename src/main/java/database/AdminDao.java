package database;
import java.util.List;
import entity.Admin;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
public class AdminDao extends GenericDao<Admin> {
    private EntityManagerFactory factory;
    public AdminDao(EntityManagerFactory factory) {
        super(Admin.class);
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
