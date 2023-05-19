package func;

import java.util.Date;


public class User {
   private String name;
   private String surname;
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

    public User(String name, String surname, String id, Location baseOfResidence, boolean isResident, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.baseOfResidence = baseOfResidence;
        this.isResident = isResident;
        this.birthday = birthday;
    }
}
