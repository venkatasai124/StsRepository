package com.example.fileupload.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	

	 public String saveImage(MultipartFile file, String name, String description) throws IOException;
}
