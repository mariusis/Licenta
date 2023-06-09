package com.InternetBanking.InternetBanking.repositories;

import com.InternetBanking.InternetBanking.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmail(String email);
    User findByUserId(Long userId);
    User findByVerificationToken(String verificationToken);
}
