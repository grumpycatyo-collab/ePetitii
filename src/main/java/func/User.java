package func;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class User {
   private String name;
   private String surname;
   @Id
   private String id;
   private Location baseOfResidence;
   private boolean isResident;
   private Date birthday;
   private String role;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Location getBaseOfResidence() {
        return baseOfResidence;
    }
    public void setBaseOfResidence(Location baseOfResidence) {
        this.baseOfResidence = baseOfResidence;
    }
    public boolean isResident() {
        return isResident;
    }
    public void setResident(boolean resident) {
        isResident = resident;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}
