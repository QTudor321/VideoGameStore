package service;
import java.util.List;
import database.AdminDao;
import entity.Admin;
import jakarta.persistence.Persistence;
public class AdminService {
    private AdminDao admindao;
    public AdminService(){
        try{
            admindao=new AdminDao(Persistence.createEntityManagerFactory("TOVPersistenceUnit"));
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void addAdmin(Admin admin){
        admindao.create(admin);
    }
    public void updateAdmin(Admin admin){
        admindao.update(admin);
    }
    public List<Admin> getAllAdmins(){
        return admindao.findAll();
    }
}
