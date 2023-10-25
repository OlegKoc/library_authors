package com.example.olegkochurov.always.yes.library_authors.service;


import com.example.olegkochurov.always.yes.library_authors.Entity.Author;
import com.example.olegkochurov.always.yes.library_authors.dao.AuthorDao;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorDao authorDao;

    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Transactional
    @Override
    public void saveNewAuthor(Author author) {
    }

    @Transactional
    @Override

    public Author getAuthor(int id) {

        return authorDao.getAuthor(id);
    }
}
