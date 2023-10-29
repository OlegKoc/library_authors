package com.example.olegkochurov.always.yes.library_authors.service;


import com.example.olegkochurov.always.yes.library_authors.Entity.Author;
import com.example.olegkochurov.always.yes.library_authors.Entity.Book;
import com.example.olegkochurov.always.yes.library_authors.dao.CatalogRepos;
import com.example.olegkochurov.always.yes.library_authors.dao.CatalogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final CatalogRepository catalogRepository;
    private final CatalogRepos catalogRepos;
    public AuthorServiceImpl(CatalogRepository catalogRepository, CatalogRepos catalogRepos) {
        this.catalogRepository = catalogRepository;
        this.catalogRepos = catalogRepos;
    }




    @Override                                       // возвращаем книгу по id
    public Book getBook(int id) {
        Book book = null;
        Optional<Book> optional = catalogRepos.findById(id);
        if (optional.isPresent()) {
            book = optional.get();
        }
        return book;
    }

    @Override                                       // добавляем книгу
    public void addNewBook(Book book) {
        catalogRepos.save(book);
    }

    @Override                                       // возвращаем всех авторов
    public List<Author> getAllAuthors() {
        return catalogRepository.findAll();
    }
    @Override
    public List<Book> getAllBook(){
        return catalogRepos.findAll();
    }

    @Override                                      // добавляем автора
    public void saveNewAuthor(Author author) {
        catalogRepository.save(author);
    }

    @Override
                                                   // возвращаем автора по id
    public Author getAuthor(int id) {
        Author author = null;
        Optional<Author> optional = catalogRepository.findById(id);
        if (optional.isPresent()) {
            author = optional.get();
        }
        return author;
    }
}
