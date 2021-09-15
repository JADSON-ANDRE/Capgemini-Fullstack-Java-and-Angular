package one.digitalinnovation.GerenciamentoDePessoas.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    @PostMapping
    public String getBook() {
        return "API Test!!";
    }
}