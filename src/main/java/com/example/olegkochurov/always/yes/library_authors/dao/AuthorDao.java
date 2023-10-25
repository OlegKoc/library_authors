package com.example.olegkochurov.always.yes.library_authors.dao;

import com.example.olegkochurov.always.yes.library_authors.Entity.Author;

public interface AuthorDao {


    public void saveNewAuthor(Author author);  //  загружаем нового автора


    public Author getAuthor(int id);     // получаем автора по id


}
