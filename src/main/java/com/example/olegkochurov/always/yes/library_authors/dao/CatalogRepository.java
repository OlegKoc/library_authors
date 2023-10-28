package com.example.olegkochurov.always.yes.library_authors.dao;

import com.example.olegkochurov.always.yes.library_authors.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<Author, Integer> {


}
