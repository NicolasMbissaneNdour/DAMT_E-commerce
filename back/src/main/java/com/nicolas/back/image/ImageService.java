package com.nicolas.back.image;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {
    
    public String store(MultipartFile file) {
        try {
            String type = file.getContentType().split("/")[1];
            String name = Long.toString(System.currentTimeMillis())+"."+type;
            Path path = Paths.get("src/main/resources/upload/"+name).toAbsolutePath();
            file.transferTo(path.toFile());
            return name;
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
