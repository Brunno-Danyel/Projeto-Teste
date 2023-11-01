package io.github.brunnodanyel.com.projetoteste.service.impl;

import io.github.brunnodanyel.com.projetoteste.model.User;
import io.github.brunnodanyel.com.projetoteste.repositories.UserRepository;
import io.github.brunnodanyel.com.projetoteste.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User finById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
    }
}
