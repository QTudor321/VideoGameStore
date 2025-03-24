package service;
import java.util.List;
import database.UserDao;
import entity.User;
import jakarta.persistence.Persistence;
public class UserService {
    private UserDao userdao;
    public UserService(){
        try{
            userdao=new UserDao(Persistence.createEntityManagerFactory("TOVPersistenceUnit"));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void addUser(User user){
        userdao.create(user);
    }
    public void updateUser(User user){
        userdao.update(user);
    }
    public List<User> getAllUsers(){
        return userdao.findAll();
    }
    //LOGIN implementation service
    public User findUser(String user, String pass) throws Exception{
        List<User> userslist=userdao.find(user);
        if(userslist.size()==0)
            throw new Exception("User not found!");
        User u=userslist.get(0);
        if(pass.compareTo(u.getPassword())!=0)
            throw new Exception("Wrong password!");
        return u;
    }
}
