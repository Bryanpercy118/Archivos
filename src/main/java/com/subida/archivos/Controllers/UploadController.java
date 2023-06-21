package com.subida.archivos.Controllers;

import com.subida.archivos.Services.IUploadFilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class UploadController {
    @Autowired
    IUploadFilesService uploadFilesService;
    @PostMapping("/picture")
    private ResponseEntity <String> uploadPicture(MultipartFile file) throws Exception{
       return new ResponseEntity<>(uploadFilesService.handleFileUpload(file), HttpStatus.OK);
    }
}
