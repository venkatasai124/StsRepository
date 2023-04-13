package com.example.fileupload.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.fileupload.serviceimpl.ImageServiceImpl;

@RestController
@RequestMapping("/api/image")
public class ImageController {
 
	@Autowired
	 ImageServiceImpl imageServiceImpl;
	@PostMapping("/saveimage")
	public String saveImage(@RequestParam ("file") MultipartFile file,
			@RequestParam("name")String name,
			@RequestParam("description") String description) throws IOException
			{imageServiceImpl.saveImage(file, name, description);
				return description;
		 
	}
	
	
}
