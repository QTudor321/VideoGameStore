package database;
import java.util.List;
import entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Root;
public class UserDao extends GenericDao<User> {
    private EntityManagerFactory factory;
    public UserDao(EntityManagerFactory factory) {
        super(User.class);
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
    //LOGIN implementation
    public List<User> find(String name){
        EntityManager em=getEntityManager();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<User> cq=cb.createQuery(User.class);
        Root<User> r=cq.from(User.class);
        ParameterExpression<String> parameterName=cb.parameter(String.class);
        cq.select(r).where(cb.equal(r.get("Username"),parameterName));
        TypedQuery<User> tquery=em.createQuery(cq);
        tquery.setParameter(parameterName,name);
        List<User> results=tquery.getResultList();
        return results;
    }
}
