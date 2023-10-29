package com.example.olegkochurov.always.yes.library_authors.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "catalog")
public class Author {
    @Id
    //@GeneratedValue(generator = "UUID")
    //@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")      //(name="id",updatable = false, nullable = false)
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int numberpassport;
    @Column
    private String citizenship;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="catalog_id")
    private List<Book> bok;


    public Author(int id, String name, String surname, int numberpassport, String citizenship) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.numberpassport = numberpassport;
        this.citizenship = citizenship;
    }
    public void addBookToAuthor(Book book) {
        if (bok == null) {
            bok = new ArrayList<>();
        }
        bok.add(book);
    }

    public Author() {

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

    public List<Book> getBok() {
        return bok;
    }

    public void setBok(List<Book> bok) {
        this.bok = bok;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberpassport=" + numberpassport +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }


}
