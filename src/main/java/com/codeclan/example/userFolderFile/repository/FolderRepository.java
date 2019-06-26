package com.codeclan.example.userFolderFile.repository;

import com.codeclan.example.userFolderFile.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
