package com.nicolas.back.image;


import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ressource/image")
public class ImageController {
    
    @GetMapping(value = "/{url}")
    public ResponseEntity<byte[]> getImage(@PathVariable("url") String url) {
        try {
            var imgFile = new ClassPathResource("upload/"+url);
            imgFile.getInputStream();
            byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());
            return ResponseEntity.ok()
                    .contentType(MediaType.IMAGE_PNG)
                    .body(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
