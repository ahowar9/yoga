package com.yoga.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.yoga.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    void delete(User user);

}