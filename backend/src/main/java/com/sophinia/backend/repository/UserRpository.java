package com.sophinia.backend.repository;

import com.sophinia.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRpository extends JpaRepository<User, Long> {

}
