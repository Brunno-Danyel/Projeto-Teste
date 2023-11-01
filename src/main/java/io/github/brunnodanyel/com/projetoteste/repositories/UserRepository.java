package io.github.brunnodanyel.com.projetoteste.repositories;

import io.github.brunnodanyel.com.projetoteste.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
