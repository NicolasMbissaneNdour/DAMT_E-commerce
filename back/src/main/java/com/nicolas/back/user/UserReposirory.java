package com.nicolas.back.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposirory extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);
}
