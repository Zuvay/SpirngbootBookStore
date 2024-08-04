package com.bookStore.controller;

import com.bookStore.entity.Book;
import com.bookStore.entity.myBook;
import com.bookStore.service.BookService;
import com.bookStore.service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService service;
    @Autowired
    private MyBookService myBookService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register") //Burası html dosyasında href verdiğimiz yer
    public String bookRegister() {
        return "bookRegister"; //bu da html dosyasının adı
    }

    @GetMapping("/available_books")
    public String availableBooks(Model model) {
        List<Book> books = service.findAllBooks();
        model.addAttribute("books", books);
        return "availableBooks";
    }

    @GetMapping("/my_books") //Sayfaya git ve kitaplığı göster
    public String myBooks(Model model) {
        List<myBook> myBooks = myBookService.findMyBooks();
        model.addAttribute("myBooks", myBooks);
        return "myBooks";
    }

    @PostMapping("/register_book")
    public String addBook(@ModelAttribute Book book) {
        service.save(book);
        return "redirect:/available_books";
    }

    @PostMapping("/delete")
    public String deleteBook(@RequestParam int id) {
        service.delete(id);
        return "redirect:/available_books";
    }

    @PostMapping("/delete_from_mybook")
    public String deleteMyBook(@RequestParam int id) {
        myBookService.delete(id);
        return "redirect:/my_books";
    }

    @PostMapping("/add_to_my_books")
    public String addToMyBooks(@RequestParam int id){
        myBookService.addBookToMyBooks(id);
        return "redirect:/available_books";
    }
}
