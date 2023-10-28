package com.example.olegkochurov.always.yes.library_authors.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="catalog")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int numberpassport;
    @Column
    private String citizenship;


    public Author(int id, String name, String surname, int numberpassport, String citizenship) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.numberpassport =numberpassport;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberpassport() {
        return numberpassport;
    }

    public void setNumberpassport(int numberpassport) {
        this.numberpassport = numberpassport;
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
                ", surName='" + surname + '\'' +
                ", numberPassport=" + numberpassport +
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
