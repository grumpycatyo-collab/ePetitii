package func;

import java.util.Date;
import java.util.List;
public class Petitie {
    private int id;
    private User initiatior;
    private String name;
    private Date date;
    private int nrSign;
    private String content;
    private String toWho;
    private Status statut;
    private List<User> semnat;
    private String feedback;
    private Date deadLine;
    private List<String> Category;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public User getInitiatior() {
        return initiatior;
    }
    public void setInitiatior(User initiatior) {
        this.initiatior = initiatior;
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
    public List<String> getCategory() {
        return Category;
    }
    public void setCategory(List<String> category) {
        Category = category;
    }

    public Petitie(int id, User initiatior, String name, Date date, String content, String toWho) {
        this.id = id;
        this.initiatior = initiatior;
        this.name = name;
        this.date = date;
        this.nrSign = 1;
        this.content = content;
        this.toWho = toWho;
    }
}
