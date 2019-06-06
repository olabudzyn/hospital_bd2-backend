package com.isieiti.bdproject.auth.repository;

import com.isieiti.bdproject.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
