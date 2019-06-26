package com.codeclan.example.userFolderFile.repository;

import com.codeclan.example.userFolderFile.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
