package com.example.fileupload.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Image {

//	@MongoId(FieldType.STRING)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	private String Name;
	private String description;
	@Lob
	private byte[] image;
}
