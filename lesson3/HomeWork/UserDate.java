package lesson3.HomeWork;

import java.time.LocalDate;

public class UserDate {
    private String firstname;
    private String lastname;
    private String middlename;
    private LocalDate birthday;
    private long phoneNumber;
    private String gender;

    public UserDate(String firstname, String lastname, String middlename, LocalDate birthday, long phoneNumber, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return String.format("Имя: %s\nФамилия: %s\nОтчество: %s\nДень рождения: %s\nТелефон: %d\nПол: %s\n",this.firstname, this.lastname, this.middlename, this.birthday, this.phoneNumber, this.gender);
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return this.middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



}
