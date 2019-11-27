package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileService {

	private static final String FILE_DIRECTORY = "";
	
	public void storeFile(MultipartFile file) throws IOException {
		Path filePath = Paths.get(FILE_DIRECTORY + "/" + file.getOriginalFilename());
		Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
	}

}