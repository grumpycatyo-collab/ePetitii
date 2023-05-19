package func;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
public class Petitie {
    @Id
    private int id;
    @ManyToOne
    private User initiatior;
    @Column(name = "Name")
    private String name;
    @Column(name = "Date")
    private Date date;
    @Column(name = "nrSign")
    private int nrSign;
    @Column(name = "Content")
    private String content;
    @Column(name = "toWho")
    private String toWho;
    @Column(name = "Status")
    private Status statut;
    @OneToMany

    private List<User> semnat;
    @Column(name = "Feedback")
    private String feedback;
    @Column(name = "deadLine")
    private Date deadLine;
    @Column(name = "nrSignNeeded")
    private int nrSignNeeded;

    private String Category;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public User getInitiatior() {
        return initiatior;
    }
    public void setInitiatior(String name) {
        this.initiatior = new User();
        initiatior.setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getNrSign() {
        return nrSign;
    }
    public void setNrSign(int nrSign) {
        this.nrSign = nrSign;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getToWho() {
        return toWho;
    }
    public void setToWho(String toWho) {
        this.toWho = toWho;
    }
    public Status getStatut() {
        return statut;
    }
    public void setStatut(Status statut) {
        this.statut = statut;
    }
    public List<User> getSemnat() {
        return semnat;
    }
    public void setSemnat(List<User> semnat) {
        this.semnat = semnat;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public Date getDeadLine() {
        return deadLine;
    }
    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        this.Category = category;
    }


}
