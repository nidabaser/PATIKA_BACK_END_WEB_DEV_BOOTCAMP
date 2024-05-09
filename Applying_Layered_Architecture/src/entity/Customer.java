package entity;

import java.time.LocalDate;

/**
 * @author Nida Başer
 * May 2024
 */

public class Customer {
    private int id;
    private String name;
    private String mail;
    private LocalDate onDate;
    private Gender gender;

    public enum Gender {
        MALE,
        FEMALE
    }

    public Customer(){

    }

    public Customer(int id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getOnDate() {
        return onDate;
    }

    public void setOnDate(LocalDate onDate) {
        this.onDate = onDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
