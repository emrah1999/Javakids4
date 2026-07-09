package com.web.project.service;

import jakarta.annotation.PostConstruct;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class FileUploadService{
    private Path rootLocation;

    @PostConstruct
    private void init() {
        rootLocation = Paths.get("C:/Users/Emrah/Desktop/Java kids/javakids4/spring/project-web/images/");
    }

   
    public String upload(MultipartFile file) throws Exception {
        // Get stream from file
        InputStream stream = file.getInputStream();


        // Get file original name
        String originalFilename = file.getOriginalFilename(); // apple.jpg

        // Create random name
        UUID uuid = UUID.randomUUID();
        String randomName = uuid.toString();

        // Get file original name without extension
        String fileNameWithoutExtension = originalFilename.substring(0, originalFilename.lastIndexOf('.'));

        // File random name for saving on disk
        String fileRandomName = originalFilename.replace(fileNameWithoutExtension, randomName);

        // Save file to disk
        Files.copy(stream, Paths.get("C:/Users/Emrah/Desktop/Java kids/javakids4/spring/project-web/images/" + fileRandomName), StandardCopyOption.REPLACE_EXISTING);

        return "C:/Users/Emrah/Desktop/Java kids/javakids4/spring/project-web/images/"+fileRandomName;
    }


   
    public Resource loadAsResource(String filename) {
        try {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Path load(String filename) {
        return rootLocation.resolve(filename);
    }
}
