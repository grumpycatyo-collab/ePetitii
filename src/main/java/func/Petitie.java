package func;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
public class Petitie {
    @Id
    private int id;

    private String initiator;

    private String name;

    private Date date;

    private int nrsign;

    private String content;

    private String towho;

    private String statut;

    private String semnat;

    private String feedback;
    private Date deadline;
    private int nrsignneeded;

    private String Category;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getInitiator() {
        return initiator;
    }
    public void setInitiator(String name) {
        this.initiator = name;
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
        return nrsign;
    }
    public void setNrSign(int nrSign) {
        this.nrsign = nrSign;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getToWho() {
        return towho;
    }
    public void setToWho(String toWho) {
        this.towho = toWho;
    }
    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
    public String getSemnat() {
        return semnat;
    }
    public void setSemnat(String semnat) {
        this.semnat = semnat;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public Date getDeadLine() {
        return deadline;
    }
    public void setDeadLine(Date deadLine) {
        this.deadline = deadLine;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        this.Category = category;
    }


}
