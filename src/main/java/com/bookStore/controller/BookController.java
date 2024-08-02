package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/book_register") //Burası html dosyasında href verdiğimiz yer
    public String bookRegister(){
        return "bookRegister"; //bu da html dosyasının adı
    }
    @GetMapping("/available_books")
    public String availableBooks(){
        return "availableBooks";
    }
    @GetMapping("/my_books")
    public String myBooks(){
        return "myBooks";
    }
}
