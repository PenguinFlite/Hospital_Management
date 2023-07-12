package com.amrit.healthcaremanagement.repo;

import com.amrit.healthcaremanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM users WHERE username=?1"
    )
    User getUserByUsername(String username);
}
