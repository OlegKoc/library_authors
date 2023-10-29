package com.example.olegkochurov.always.yes.library_authors.controller;


import com.example.olegkochurov.always.yes.library_authors.Entity.Author;
import com.example.olegkochurov.always.yes.library_authors.Entity.Book;
import com.example.olegkochurov.always.yes.library_authors.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    private final AuthorService authorService;


    public MyRESTController(AuthorService authorService) {
        this.authorService = authorService;

    }

    @GetMapping("/authors")                                        // возвращаем всех авторов
    public List<Author> getAllAuthors() {
        List<Author> allAuthors = authorService.getAllAuthors();
        return allAuthors;
    }

    @GetMapping("/authors/{id}")                                   // возвращаем автора по его id
    public Author getAuthor(@PathVariable int id) {
        Author author = authorService.getAuthor(id);
        return author;

    }

    @PostMapping("/author")                                         // добавляем автора
    public Author addNewAuthor(@RequestBody Author author) {
        authorService.saveNewAuthor(author);
        return author;

    }


    @GetMapping("/books/{id}")                                     // возвращаем книгу  по  id
    public Book getBook(@PathVariable int id) {
        Book book = authorService.getBook(id);
        return book;

    }

    @GetMapping("/books")
    public List<Book> showAllBook() {                                 // метод возвращает все книги
        List<Book> allBook = authorService.getAllBook();
        return allBook;
    }


    @PostMapping("/books")                                          // добавляем книги
    public Book addNewBooks(@RequestBody Book book) {
        authorService.addNewBook(book);
        return book;

    }

}
