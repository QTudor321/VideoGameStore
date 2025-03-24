package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "issue")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDissue", nullable = false)
    private Integer id;

    @Column(name = "TitleIssue", length = 45)
    private String titleIssue;

    @Column(name = "DescriptionIssue", length = 45)
    private String descriptionIssue;

    @Column(name = "ReportDate")
    private String reportDate;

    public Issue(){}
    public Issue(String titleIssue, String descriptionIssue, String reportDate) {
        this.titleIssue = titleIssue;
        this.descriptionIssue = descriptionIssue;
        this.reportDate = reportDate;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleIssue() {
        return titleIssue;
    }

    public void setTitleIssue(String titleIssue) {
        this.titleIssue = titleIssue;
    }

    public String getDescriptionIssue() {
        return descriptionIssue;
    }

    public void setDescriptionIssue(String descriptionIssue) {
        this.descriptionIssue = descriptionIssue;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

}