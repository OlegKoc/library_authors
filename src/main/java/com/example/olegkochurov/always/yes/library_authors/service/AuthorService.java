package com.example.olegkochurov.always.yes.library_authors.service;


import com.example.olegkochurov.always.yes.library_authors.Entity.Author;
import com.example.olegkochurov.always.yes.library_authors.Entity.Book;

import java.util.List;

public interface AuthorService {

    public Book getBook(int id);

    public void addNewBook(Book book);

    public List<Author> getAllAuthors();

    List<Book> getAllBook();

    public void saveNewAuthor(Author author);  //  загружаем нового автора

    public Author getAuthor(int id);           // получаем автора по id


}

