/**
 * 
 */
package com.hack.saksham.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.vision.CloudVisionTemplate;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@RequestMapping("/getLabelDetection")
	public String getLabelDetection() {

	  Resource imageResource = this.resourceLoader.getResource("file:src/main/resources/cat.jpg");
	  AnnotateImageResponse response = this.cloudVisionTemplate.analyzeImage(
	                                      imageResource, Feature.Type.LABEL_DETECTION);

	  return response.getLabelAnnotationsList().toString();

	}
}
