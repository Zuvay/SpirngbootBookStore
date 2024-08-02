package com.bookStore.controller;

import com.bookStore.entity.Book;
import com.bookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService service;
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/book_register") //Burası html dosyasında href verdiğimiz yer
    public String bookRegister(){
        return "bookRegister"; //bu da html dosyasının adı
    }
    @GetMapping("/available_books")
    public String availableBooks(Model model){
        List<Book> books = service.findAllBooks();
        model.addAttribute("books", books);
        return "availableBooks";
    }
    @GetMapping("/my_books")
    public String myBooks(){
        return "myBooks";
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
        service.save(book);
        return "redirect:/available_books";
    }
    @PostMapping("/delete")
    public String deleteBook(@RequestParam int id){
        service.delete(id);
        return "redirect:/available_books";
    }
    @GetMapping("/my_books")
    public String myBooks(Model model) {
        List<Book> myBooks = service.findMyBooks(); // Bu metod kitaplığıma eklenmiş kitapları döndürmeli
        model.addAttribute("books", myBooks);
        return "myBooks";
    }

}
