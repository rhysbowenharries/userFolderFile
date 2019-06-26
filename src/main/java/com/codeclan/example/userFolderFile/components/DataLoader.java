package com.codeclan.example.userFolderFile.components;

import com.codeclan.example.userFolderFile.models.File;
import com.codeclan.example.userFolderFile.models.Folder;
import com.codeclan.example.userFolderFile.models.User;
import com.codeclan.example.userFolderFile.repository.FileRepository;
import com.codeclan.example.userFolderFile.repository.FolderRepository;
import com.codeclan.example.userFolderFile.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user = new User("Clive");
        userRepository.save(user);

        Folder folder1 = new Folder("Folder One", user);
        folderRepository.save(folder1);

        Folder folder2 = new Folder( "Folder Two", user);
        folderRepository.save(folder2);

        File file1 = new File("File One", "Java", 23, folder1);
        fileRepository.save(file1);

        File file2 = new File("File two", "Python", 44, folder1);
        fileRepository.save(file1);
    }
}
