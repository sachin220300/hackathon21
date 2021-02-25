/**
 * 
 */
package com.hack.saksham.controller;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.vision.CloudVisionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.Feature;

/**
 * @author sachin
 *
 */
@RestController
public class VisionController {

	@Autowired
	private CloudVisionTemplate cloudVisionTemplate;
	
	@Autowired
	ResourceLoader resourceLoader;
	
	@GetMapping("/index")
	public String showUserList(Model model) {
	    //model.addAttribute("users", userRepository.findAll());
	    return "index.html";
	}
	
	@RequestMapping("/getLabelDetection")
	public String getLabelDetection() {

	  Resource imageResource = this.resourceLoader.getResource("file:src/main/resources/currency.jpg");
	  AnnotateImageResponse response = this.cloudVisionTemplate.analyzeImage(
	                                      imageResource, Feature.Type.LABEL_DETECTION);

	  return response.getLabelAnnotationsList().toString();

	}
	
	@RequestMapping("/getTextDetection")
	public String getTextDetection() {

	  Resource imageResource = this.resourceLoader.getResource("file:src/main/resources/Branch-Notice.jpg");
	  AnnotateImageResponse response = this.cloudVisionTemplate.analyzeImage(
	          imageResource, Feature.Type.DOCUMENT_TEXT_DETECTION);
	 // response.getTextAnnotationsList().toString().
	  return response.getTextAnnotationsList().toString();

	}
	
	@PostMapping("/upload")
	public String upload(@RequestPart("imageFile") MultipartFile file) throws IOException {
		 
		String name = "demo.jpg";
		if (!file.isEmpty()) {
		        try {
		            byte[] bytes = file.getBytes();
		            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(name)));
		            stream.write(bytes);
		            stream.close();
		           // return "You successfully uploaded " + name + "!";
		        } catch (Exception e) {
		        	e.printStackTrace();
		           // return "You failed to upload " + name + " => " + e.getMessage();
		        }
		    } else {
		        return "You failed to upload " + name + " because the file was empty.";
		    }
	  Resource imageResource = this.resourceLoader.getResource("file:demo.jpg");
	  AnnotateImageResponse response = this.cloudVisionTemplate.analyzeImage(
	          imageResource, Feature.Type.DOCUMENT_TEXT_DETECTION);
	 // response.getTextAnnotationsList().toString().
	 // ObjectMapper objectMapper = new ObjectMapper(response.getTextAnnotationsList().toString());
	  return response.getTextAnnotationsList().toString();

	}
	
	
	public  static File multipartToFile(MultipartFile multipart, String fileName) throws IllegalStateException, IOException {
	    File convFile = new File(System.getProperty("java.io.tmpdir")+"/"+fileName);
	    multipart.transferTo(convFile);
	    return convFile;
	}
	
	private static class Configuration{
	    @Bean
	    public ObjectMapper objectMapper(){
	        ObjectMapper mapper = new ObjectMapper();
	        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
	        mapper.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
	        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	        mapper.setVisibility(mapper.getSerializationConfig()
	                .getDefaultVisibilityChecker().withFieldVisibility(JsonAutoDetect.Visibility.ANY)
	                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
	                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
	                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
	        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
	        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
	        return mapper;
	    }
	    }

	
}
