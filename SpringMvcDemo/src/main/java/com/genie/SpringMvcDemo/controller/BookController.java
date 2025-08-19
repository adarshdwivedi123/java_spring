package com.genie.SpringMvcDemo.controller;


import com.genie.SpringMvcDemo.dto.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.ArrayList;


@Controller
public class BookController {

    private List<Book> bookList=new ArrayList<>();
    @GetMapping("/books")
    public String getBooks(Model model){
        Book book =new Book("Genie Book","Upadhaya");
        Book book1 =new Book("Adsrsh Book","Upadhaya");
        Book book2 =new Book("Shubham Book","Upadhaya");
        bookList.add(book1);
        bookList.add(book);
        bookList.add(book2);
        model.addAttribute("books",bookList);
        return "books";
    }
    @PostMapping("/add-book")
    public String  addBooks(@ModelAttribute Book book){
            bookList.add(book);
            return "redirect:/books";

    }

    @GetMapping("/add-book")
    public String  ShowAlBooks(Model model)
    {
        model.addAttribute("book",new Book());
        return "add-book";
    }

}
