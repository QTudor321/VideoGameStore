package database;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;
public abstract class GenericDao<T> {
    private Class<T> entityT;
    public GenericDao(Class<T> eT){
        this.entityT=eT;
    }
    public abstract EntityManager getEntityManager();
    public void create(T entity){
        EntityManager em=getEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }
    public void update(T entity){
        EntityManager em=getEntityManager();
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
    }
    public void remove(T entity, int IDEntity){
        EntityManager em=getEntityManager();
        em.getTransaction().begin();
        em.remove((T) em.find(this.entityT, IDEntity));
        em.getTransaction().commit();
    }
    public T find(int ID){
        EntityManager em=getEntityManager();
        T value=(T) em.find(this.entityT, ID);
        return value;
    }
    public List<T> findAll(){
        EntityManager em=getEntityManager();
        CriteriaQuery<Object> cq=em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(this.entityT));
        List<T> returnValues=(List<T>) em.createQuery(cq).getResultList();
        return returnValues;
    }
}
