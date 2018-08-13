package com.springboot.starter.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topics")  //By Default its RequestMethod is GET
	public List<Topic> getAllTopics() {
		
		return topicService.getAllTopics();
				
				
	}
	
	@RequestMapping("/topics")  //By Default its RequestMethod is GET
	public Topic getTopic() {
		
		return topicService.getAllTopics();
				
				
	}

}
