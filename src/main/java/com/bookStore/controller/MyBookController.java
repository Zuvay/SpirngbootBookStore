package com.bookStore.controller;

import com.bookStore.entity.MyBook;
import com.bookStore.repository.MyBookRepository;
import com.bookStore.service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/my_book")
public class MyBookController {
    @Autowired
    private MyBookService myBookService;
    @GetMapping("/my_books") //Sayfaya git ve kitaplığı göster
    public String myBooks(Model model) {
        List<MyBook> myBooks = myBookService.findMyBooks();
        model.addAttribute("myBooks", myBooks);
        return "myBooks";
    }

    @PostMapping("/delete_from_mybook")
    public String deleteMyBook(@RequestParam int id) {
        myBookService.delete(id);
        return "redirect:/my_book/my_books";
    }

    @PostMapping("/add_to_my_books")
    public String addToMyBooks(@RequestParam int id){
        myBookService.addBookToMyBooks(id);
        return "redirect:/book/available_books";
    }
}
