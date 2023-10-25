package com.example.olegkochurov.always.yes.library_authors.service;


import com.example.olegkochurov.always.yes.library_authors.Entity.Author;

public interface AuthorService {


    public void saveNewAuthor(Author author);  //  загружаем нового автора
    public Author getAuthor(int id);           // получаем автора по id


}

