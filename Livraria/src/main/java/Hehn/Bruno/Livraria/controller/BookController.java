package Hehn.Bruno.Livraria.controller;

import Hehn.Bruno.Livraria.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class BookController {

    @GetMapping("/livro")
    public Book getBook(){
        Book book = new Book();
        book.setName("A HISTÓRIA DOS VIDEOGAMES - VOLUME 1");
        book.setPrice(99.90);
        book.setAuthor("EVAN AMOS");
        return book;
    }

    @GetMapping("/livros")
    public ArrayList<Book> getBooks(){
        Book book1 = new Book();
        book1.setName("A HISTÓRIA DOS VIDEOGAMES - VOLUME 1");
        book1.setPrice(99.90);
        book1.setAuthor("EVAN AMOS");

        Book book2 = new Book();
        book2.setName("CÓDIGO DE DEFESA DO CONSUMIDOR - 2020");
        book2.setPrice(13.90);
        book2.setAuthor("INACIO CONCEIÇAO VIEIRA");

        ArrayList<Book> register = new ArrayList<>();
        register.add(book1);
        register.add(book2);

        return register;
    }
}
