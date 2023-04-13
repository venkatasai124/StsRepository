package com.example.fileupload.serviceimpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.fileupload.entity.Image;
import com.example.fileupload.repository.ImageRepository;
import com.example.fileupload.service.ImageService;


@Service
public class ImageServiceImpl  implements ImageService{

	
	@Autowired
	private ImageRepository imageRepository;
	@Override
	public String saveImage(MultipartFile file, String name, String description) throws IOException     {
		Image image = new Image();
		image.setName(name);
		image.setDescription(description);
		image.setImage(file.getBytes());
		imageRepository.save(image);
		
		return "Image saved in DB";
	}
	
	

}
