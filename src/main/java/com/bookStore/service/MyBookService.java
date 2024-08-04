package com.bookStore.service;

import com.bookStore.entity.Book;
import com.bookStore.entity.myBook;
import com.bookStore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookService {
    @Autowired
    private MyBookRepository myBookRepository;

    @Autowired
    BookService bookService;

    public void delete(int id) {
        myBookRepository.deleteById(id);
    }

    public List<myBook> findMyBooks() {
        return myBookRepository.findAll();
    }

    public void addBookToMyBooks(int id) {
        Book book = bookService.findBookById(id);
        if (book != null) {
            myBook myBook = new myBook();
            myBook.setId(book.getId());
            myBook.setName(book.getName());
            myBook.setAuthor(book.getAuthor());
            myBook.setPrice(book.getPrice());
            myBookRepository.save(myBook);
        }
    }
}
