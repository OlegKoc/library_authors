package com.example.olegkochurov.always.yes.library_authors.dao;

import com.example.olegkochurov.always.yes.library_authors.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepos extends JpaRepository<Book, Integer> {
}
