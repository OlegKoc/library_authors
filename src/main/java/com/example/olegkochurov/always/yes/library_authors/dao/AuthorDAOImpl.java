package com.example.olegkochurov.always.yes.library_authors.dao;

import com.example.olegkochurov.always.yes.library_authors.Entity.Author;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
public class AuthorDAOImpl implements AuthorDao {
        @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void saveNewAuthor(Author author) {
        entityManager.merge(author);
    }

    @Override
    public Author getAuthor(int id) {
        Author author = entityManager.find(Author.class, id);
        return author;
    }

}
