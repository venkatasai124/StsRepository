package com.example.fileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class })
public class ImageOrFileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageOrFileUploadApplication.class, args);
	}

}
