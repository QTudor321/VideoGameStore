package service;

import database.IssueDao;
import entity.Issue;
import jakarta.persistence.Persistence;

import java.util.List;

public class IssueService {
    private IssueDao issuedao;
    public IssueService(){
        try{
            issuedao=new IssueDao(Persistence.createEntityManagerFactory("TOVPersistenceUnit"));
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void addIssue(Issue i){
        issuedao.create(i);
    }
    public void updateIssue(Issue i){
        issuedao.update(i);
    }
    public List<Issue> getAllIssues(){
        return issuedao.findAll();
    }

}
