package io.github.brunnodanyel.com.projetoteste.controller;

import io.github.brunnodanyel.com.projetoteste.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return new User(1L, "Usuário Teste ", "user@gmail.com ", "1234");
    }
}
