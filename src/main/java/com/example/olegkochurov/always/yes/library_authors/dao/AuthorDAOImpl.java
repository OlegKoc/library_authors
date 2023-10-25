package com.example.olegkochurov.always.yes.library_authors.dao;

import com.example.olegkochurov.always.yes.library_authors.Entity.Author;
import jakarta.websocket.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class AuthorDAOImpl implements AuthorDao {
    @PersistenceContext
    private EntityManager entityManager;
//    private EntityManager entityManager;
//
//    public AuthorDAOImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }


    @Override
    public void saveNewAuthor(Author author) {
        Session session = entityManager.unwrap(Session.class);
    }

    @Override
    public Author getAuthor(int id) {
        Session session = entityManager.unwrap(Session.class);
        Author author = (Author) session .getOpenSessions();
        return  author;
    }

}
