package com.example.olegkochurov.always.yes.library_authors.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Author {
    @Id
    private int id;
    private String name;
    private String surName;
    private int numberPassport;
    private String citizenship;


    public Author(int id, String name, String surName, int numberPassport, String citizenship) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.numberPassport = numberPassport;
        this.citizenship = citizenship;
    }

    public Author() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(int numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", numberPassport=" + numberPassport +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }


    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }
}
