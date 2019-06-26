package com.codeclan.example.userFolderFile.repository;

import com.codeclan.example.userFolderFile.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
