package com.bookStore.service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public void save(Book book){
        repository.save(book);
    }
    public void delete(int id){
        repository.deleteById(id);
    }
    public List<Book> findAllBooks(){
        return repository.findAll();
    }

    public List<Book> findMyBooks() {
        //my books diye yeni repo oluştur
        //verileri ordan çek diğer taraftaki buton ile de oraya ekle
        return repository.findAll();
    }

}
