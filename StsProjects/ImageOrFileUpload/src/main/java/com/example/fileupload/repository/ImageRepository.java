package com.example.fileupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.fileupload.entity.Image;


public interface ImageRepository extends JpaRepository<Image, Long>{
	

}
